package X;

/* renamed from: X.9L7  reason: invalid class name */
public class AnonymousClass9L7 {
    public final AnonymousClass82W A00;
    public final C208979zG A01;
    public final AnonymousClass82R A02;
    public final C23092B4c[] A03;

    public AnonymousClass9L7(C23092B4c... b4cArr) {
        AnonymousClass82W r4 = new AnonymousClass82W();
        C208979zG r3 = new C208979zG();
        int length = b4cArr.length;
        C23092B4c[] b4cArr2 = new C23092B4c[(length + 3)];
        this.A03 = b4cArr2;
        System.arraycopy(b4cArr, 0, b4cArr2, 0, length);
        this.A00 = r4;
        this.A01 = r3;
        AnonymousClass82R r0 = new AnonymousClass82R();
        this.A02 = r0;
        b4cArr2[length] = r0;
        b4cArr2[length + 1] = r4;
        b4cArr2[length + 2] = r3;
    }
}
