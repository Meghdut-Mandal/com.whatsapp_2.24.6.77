package X;

import android.graphics.Bitmap;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3vz  reason: invalid class name and case insensitive filesystem */
public class C80803vz implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public String A06;
    public boolean A07;
    public final int A08;

    public C80803vz(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, int i, boolean z) {
        this.A08 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A06 = str;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A07 = z;
        this.A05 = obj6;
    }

    public final void run() {
        int i;
        String str;
        AnonymousClass3YK r2;
        if (this.A08 != 0) {
            C41021wU r6 = (C41021wU) this.A00;
            C42251yW r7 = (C42251yW) this.A01;
            AnonymousClass35P r12 = (AnonymousClass35P) this.A02;
            AnonymousClass35Q r0 = (AnonymousClass35Q) this.A03;
            Bitmap bitmap = (Bitmap) this.A04;
            String str2 = this.A06;
            boolean z = this.A07;
            C80143uv r5 = (C80143uv) this.A05;
            String str3 = r12.A00;
            String str4 = r0.A01;
            int i2 = r0.A00;
            C39871u3 r8 = r6.A08;
            if (z || !r8.A09) {
                r2 = new AnonymousClass3YK(r6, r5, 3, z);
            } else {
                r2 = null;
            }
            String str5 = r12.A01;
            r7.A01.setText(str3);
            TextView textView = r7.A02;
            textView.setText(str4);
            if (i2 != 0) {
                C36331k8.A0r(textView.getContext(), textView, i2);
            }
            r7.A03.A0I(str2);
            int i3 = 8;
            if (str4 != null) {
                i3 = 0;
            }
            textView.setVisibility(i3);
            r7.A00.setImageBitmap(bitmap);
            if (r2 != null) {
                r7.A0H.setOnClickListener(r2);
            }
            TypedValue typedValue = new TypedValue();
            View view = r7.A0H;
            C36361kB.A09(view).resolveAttribute(16843534, typedValue, true);
            view.setBackgroundResource(typedValue.resourceId);
            view.setContentDescription(str5);
            if (r7 instanceof C47082ct) {
                C47082ct r72 = (C47082ct) r7;
                ImageView imageView = r72.A00;
                AnonymousClass3T1 A0R = C36421kH.A0R(r8.A04, r5.A00);
                C001700s A0S = C36431kI.A0S();
                r8.A05.A0C(imageView, A0R, new C79283tT(imageView, A0S, r8));
                C65973Ue.A01(r6.A00, A0S, r72, 16);
                C48902iF.A00(imageView, r6, r5, 22);
                return;
            }
            return;
        }
        AnonymousClass6VL r22 = (AnonymousClass6VL) this.A00;
        File file = (File) this.A01;
        String str6 = this.A06;
        List list = (List) this.A02;
        List list2 = (List) this.A03;
        AtomicReference atomicReference = (AtomicReference) this.A04;
        boolean z2 = this.A07;
        CountDownLatch countDownLatch = (CountDownLatch) this.A05;
        C36381kD.A1K(atomicReference, 5, countDownLatch);
        try {
            AnonymousClass179 r122 = r22.A0L;
            String A052 = C34191gb.A05(r122, file);
            if (A052 == null) {
                C36321k7.A1J(file, "gdrive/backup/collect-files-to-be-uploaded/file-upload-path-is-null/ ", AnonymousClass000.A0u());
            } else {
                Map map = r22.A0a;
                C131526Pk r9 = (C131526Pk) map.get(A052);
                C33131el r28 = r22.A0J;
                if (r28.A00()) {
                    String absolutePath = file.getAbsolutePath();
                    AnonymousClass00C.A08(absolutePath);
                    C20830yE r02 = r22.A0P;
                    C20830yE r18 = r02;
                    int A002 = AnonymousClass6YN.A00(r9, r122, r02, absolutePath);
                    if (!(A002 == 1 || A002 == 3)) {
                        Locale locale = Locale.ENGLISH;
                        Object[] objArr = new Object[2];
                        objArr[0] = A052;
                        if (A002 == 2) {
                            str = "remote-file-does-not-exist";
                        } else if (A002 != 3) {
                            str = "remote-file-different-from-local";
                        } else {
                            str = "remote-file-same-as-local";
                        }
                        objArr[1] = str;
                        AnonymousClass00C.A08(String.format(locale, "gdrive/backup/get-files-to-be-uploaded fileUploadPath is %s, fileStatus is %s.", Arrays.copyOf(objArr, 2)));
                        AnonymousClass6FR r182 = new AnonymousClass6FR(r22.A0A, r22.A0D, r22.A0H, r122, r22.A0M, r18, file, str6, A052);
                        list.add(r182);
                        String str7 = r182.A03;
                        map.remove(str7);
                        if (r9 != null && !AnonymousClass00C.A0J(r9.A06, str7)) {
                            list2.add(r9);
                            map.remove(r9.A01());
                        }
                    }
                    AtomicLong atomicLong = r22.A0c;
                    atomicLong.addAndGet(file.length());
                    if (r28.A00() && r22.A0F.A0Q.get() && z2) {
                        C33121ek r82 = r22.A0G;
                        long j = atomicLong.get();
                        long j2 = r22.A05;
                        if (j2 > 0) {
                            i = Math.min(100, (int) ((100 * j) / j2));
                        } else {
                            i = -1;
                            StringBuilder A0u = AnonymousClass000.A0u();
                            A0u.append("GoogleBackupRestoreObservable/backup-preparation-progress ");
                            A0u.append(j);
                            C36321k7.A1V("/", A0u, j2);
                        }
                        if (i != r82.A00) {
                            r82.A00 = i;
                            StringBuilder A0u2 = AnonymousClass000.A0u();
                            A0u2.append("GoogleBackupRestoreObservable/backup-preparation-progress/");
                            A0u2.append(i);
                            C36321k7.A1a(A0u2, "%");
                            Iterator A0s = C36361kB.A0s(r82);
                            while (A0s.hasNext()) {
                                ((C33151eo) A0s.next()).BRx(r82.A00);
                            }
                        }
                    }
                }
            }
        } catch (C101864yP e) {
            C36321k7.A1M(file, "gdrive/backup/get-files-to-be-uploaded problem with a file ", AnonymousClass000.A0u(), e);
            atomicReference.set(e);
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
