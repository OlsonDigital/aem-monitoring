// automatically generated by the FlatBuffers compiler, do not modify

package com.icfolson.aem.monitoring.serialization.generated;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Metrics extends Table {
  public static Metrics getRootAsMetrics(ByteBuffer _bb) { return getRootAsMetrics(_bb, new Metrics()); }
  public static Metrics getRootAsMetrics(ByteBuffer _bb, Metrics obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public Metrics __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public MetricValue metricValues(int j) { return metricValues(new MetricValue(), j); }
  public MetricValue metricValues(MetricValue obj, int j) { int o = __offset(4); return o != 0 ? obj.__init(__indirect(__vector(o) + j * 4), bb) : null; }
  public int metricValuesLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public MetricName names(int j) { return names(new MetricName(), j); }
  public MetricName names(MetricName obj, int j) { int o = __offset(6); return o != 0 ? obj.__init(__indirect(__vector(o) + j * 4), bb) : null; }
  public int namesLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }

  public static int createMetrics(FlatBufferBuilder builder,
      int metricValuesOffset,
      int namesOffset) {
    builder.startObject(2);
    Metrics.addNames(builder, namesOffset);
    Metrics.addMetricValues(builder, metricValuesOffset);
    return Metrics.endMetrics(builder);
  }

  public static void startMetrics(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addMetricValues(FlatBufferBuilder builder, int metricValuesOffset) { builder.addOffset(0, metricValuesOffset, 0); }
  public static int createMetricValuesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startMetricValuesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addNames(FlatBufferBuilder builder, int namesOffset) { builder.addOffset(1, namesOffset, 0); }
  public static int createNamesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startNamesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endMetrics(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
  public static void finishMetricsBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
}

