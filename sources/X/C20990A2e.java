package X;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.A2e  reason: case insensitive filesystem */
public class C20990A2e implements C161067m6 {
    public final CopyOnWriteArraySet A00;
    public final Handler A01;

    public void BVF(long j, String str, boolean z) {
        this.A01.post(new AnonymousClass73I(this, str, 0, j, z));
    }

    public void Bcn(C118655oW r11, C200889iQ r12, C207019uQ r13, C207179ug r14, String str, String str2) {
        C207179ug r3 = r14;
        this.A01.post(new C21676AVw(this, r3, r13, r11, r12, str, str2, 0));
    }

    public void BkL(float f, int i, int i2, int i3) {
        this.A01.post(new C1498573a(this, f, i2, i3, i, 1));
    }

    public void BV0(List list) {
        C165587tf.A0z(this.A01, this, list, 7);
    }

    public void BWF() {
        this.A01.post(new C1497572q(this, 16));
    }

    public void BX4(C200889iQ r3, String str, String str2, String str3, long j) {
        this.A01.post(new AVo(this, r3, str, str2, str3, j));
    }

    public void BZm(boolean z) {
        this.A01.post(new AnonymousClass75B(3, (Object) this, z));
    }

    public void BbV(byte[] bArr) {
        C165587tf.A0z(this.A01, this, bArr, 10);
    }

    public void Bcl() {
        this.A01.post(new C1497572q(this, 20));
    }

    public void Bcp(C207179ug r3, float f, long j) {
        this.A01.post(new AVg(this, r3, f, j));
    }

    public void BdP(C207179ug r4, String str) {
        this.A01.post(new C1502274l(this, r4, str, 6));
    }

    public void BdQ() {
        this.A01.post(new C1497572q(this, 19));
    }

    public void Bg4(long j) {
        this.A01.post(new C80303vB(this, j, 1));
    }

    public void BhD(C207019uQ r3, C207179ug r4, String str, long j, boolean z, boolean z2) {
        this.A01.post(new AVs(this, r3, r4, str, j, z, z2));
    }

    public void Bhr(long j, long j2, boolean z, boolean z2) {
        this.A01.post(new AVl(this, j, j2, z, z2));
    }

    public void Bhw(C118655oW r3) {
        C165587tf.A0z(this.A01, this, r3, 6);
    }

    public void Bhx(boolean z) {
        this.A01.post(new AnonymousClass75B(2, (Object) this, z));
    }

    public void BjB(List list) {
        C165587tf.A0z(this.A01, this, list, 9);
    }

    public void BkE(C207019uQ r3, C207179ug r4, String str, String str2, String str3, String str4, long j, boolean z) {
        this.A01.post(new AW1(this, r3, r4, str, str2, str3, str4, j, z));
    }

    public void BkG(C118655oW r3, C207019uQ r4, C207179ug r5, Integer num, String str, boolean z, boolean z2) {
        this.A01.post(new C21677AVx(this, r3, r4, r5, num, str, z, z2));
    }

    public void BkH(String str, String str2) {
        this.A01.post(new C80393vK(this, str2, str, 1));
    }

    public void BkI(C118655oW r3, C207019uQ r4, C207179ug r5, Integer num, String str, String str2, String str3, long j, long j2, boolean z) {
        this.A01.post(new AW7(this, r3, r4, r5, num, str, str2, str3, j, j2, z));
    }

    public void BkJ() {
        this.A01.post(new C1497572q(this, 17));
    }

    public void BkK() {
        this.A01.post(new C1497572q(this, 18));
    }

    public void BkN(C207019uQ r3, C207179ug r4, String str, String str2, String str3, String str4, String str5, long j, boolean z, boolean z2) {
        this.A01.post(new AW6(this, r3, r4, str, str2, str3, str4, str5, j, z, z2));
    }

    public void BkX(boolean z, boolean z2) {
        this.A01.post(new C81223wf(this, 0, z, z2));
    }

    public void Bka(C200889iQ r3) {
        C165587tf.A0z(this.A01, this, r3, 8);
    }

    public C20990A2e(Handler handler, C161067m6 r3) {
        this.A01 = handler;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.A00 = copyOnWriteArraySet;
        copyOnWriteArraySet.add(r3);
    }
}
