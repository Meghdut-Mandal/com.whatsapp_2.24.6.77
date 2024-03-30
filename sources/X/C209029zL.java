package X;

import android.media.MediaCrypto;
import java.util.Objects;
import java.util.UUID;

/* renamed from: X.9zL  reason: invalid class name and case insensitive filesystem */
public final class C209029zL implements C15870o7 {
    public final MediaCrypto A00;
    public final UUID A01;
    public final byte[] A02;

    public C209029zL(MediaCrypto mediaCrypto, UUID uuid, byte[] bArr) {
        Objects.requireNonNull(mediaCrypto);
        this.A00 = mediaCrypto;
        this.A01 = uuid;
        this.A02 = bArr;
    }
}
