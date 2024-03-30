package com.facebook.profilo.writer;

public interface NativeTraceWriterCallbacks {
    void onTraceWriteAbort(long j, int i);

    void onTraceWriteEnd(long j);

    void onTraceWriteException(long j, Throwable th);

    void onTraceWriteStart(long j, int i);
}
