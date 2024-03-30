package org.chromium.net;

import X.B8O;
import X.C22580Aqz;
import X.C22581Ar0;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.nio.ByteBuffer;

public final class UploadDataProviders {
    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return new C22580Aqz(ByteBuffer.wrap(bArr, i, i2).slice());
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new C22581Ar0(new B8O(parcelFileDescriptor, 1));
    }

    public static UploadDataProvider create(File file) {
        return new C22581Ar0(new B8O(file, 0));
    }

    public static UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new C22580Aqz(byteBuffer.slice());
    }
}
