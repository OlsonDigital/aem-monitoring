package com.icfolson.aem.monitoring.database.connection;

import com.google.common.collect.Sets;
import com.icfolson.aem.monitoring.database.exception.MonitoringDBException;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.conf.RenderNameStyle;
import org.jooq.conf.Settings;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Set;

/**
 * A utility class that provides a Jooq DSL context object, while also providing connection managerment via the
 * AutoCloseable interface.
 */
public class ConnectionWrapper implements AutoCloseable {

    private Set<SQLDialect> MYSQL_DIALECTS = Sets.immutableEnumSet(SQLDialect.MARIADB, SQLDialect.MYSQL);

    private final Connection connection;
    private final SQLDialect dialect;
    private DSLContext context;

    public ConnectionWrapper(Connection connection, SQLDialect dialect) throws SQLException {
        this.connection = connection;
        this.dialect = dialect;
        connection.setAutoCommit(true);
    }

    public DSLContext getContext() {
        if (context == null) {
            context = DSL.using(connection, dialect, new Settings().withRenderNameStyle(RenderNameStyle.AS_IS));
            if (MYSQL_DIALECTS.contains(dialect)) {
                context.execute("set names utf8mb4;");
            }
        }
        return context;
    }

    @Override
    public void close() throws MonitoringDBException {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new MonitoringDBException(e);
        }
    }
}
