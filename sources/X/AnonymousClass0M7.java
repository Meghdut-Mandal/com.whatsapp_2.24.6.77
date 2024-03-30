package X;

import java.io.IOException;

/* renamed from: X.0M7  reason: invalid class name */
public final class AnonymousClass0M7 extends AnonymousClass0M8 implements C16910qI {
    public static final AnonymousClass0M7 zzb;
    public C17850sA zzd = AnonymousClass0M3.A02;

    public static AnonymousClass0M7 A00(byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr.length;
        C07490Xw r2 = C07490Xw.A01;
        AnonymousClass0M7 r5 = new AnonymousClass0M7();
        try {
            C17320r6 A00 = C07150Wn.A02.A00(r5.getClass());
            A00.Byr(new C07050Wd(r2), r5, bArr2, 0, length);
            A00.Byo(r5);
            if (r5.zza == 0) {
                return r5;
            }
            throw new RuntimeException();
        } catch (C05050Na e) {
            e = e;
            e.zza = r5;
            throw e;
        } catch (C13140jN e2) {
            e = new C05050Na(e2.getMessage());
            e.zza = r5;
            throw e;
        } catch (IOException e3) {
            if (e3.getCause() instanceof C05050Na) {
                throw e3.getCause();
            }
            e = new C05050Na(e3);
            e.zza = r5;
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            e = new C05050Na("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            e.zza = r5;
            throw e;
        }
    }

    static {
        AnonymousClass0M7 r2 = new AnonymousClass0M7();
        zzb = r2;
        AnonymousClass0M8.zzb.put(AnonymousClass0M7.class, r2);
    }
}
