package X;

/* renamed from: X.1ai  reason: invalid class name and case insensitive filesystem */
public class C30751ai {
    public final AnonymousClass18P A00;

    public static void A00(C26911Lz r4, String str, int i, int i2) {
        ((AnonymousClass1M0) r4).A02.A03("rmr_response_error", "file_key = ?  AND rmr_source =?  AND response_device_id =? ", "RequestMediaReUploadResponseErrorStore.deleteResponseErrorWithDeviceId", new String[]{str, String.valueOf(i), String.valueOf(i2)});
    }

    public C30751ai(AnonymousClass18P r1) {
        this.A00 = r1;
    }

    public void A01(String str, int i, int i2) {
        C18740tg.A00();
        AnonymousClass1M0 A04 = this.A00.A04();
        try {
            A00(A04, str, i, i2);
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }
}
