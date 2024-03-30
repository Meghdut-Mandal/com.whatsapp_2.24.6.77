package com.facebook.minscript.compiler;

import com.facebook.minscript.compiler.interfaces.MinsCompilerResult;
import com.facebook.soloader.SoLoader;
import java.nio.ByteBuffer;

public class MinsCompilerImpl$Helper {
    public static native ByteBuffer doCompile(byte[] bArr, boolean z);

    public static native MinsCompilerResult doCompileWithLispyOffsets(byte[] bArr, boolean z);

    static {
        SoLoader.A06("minscompiler-jni");
    }
}
