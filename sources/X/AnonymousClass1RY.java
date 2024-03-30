package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* renamed from: X.1RY  reason: invalid class name */
public class AnonymousClass1RY {
    public C50352kc A00;
    public final float A01;
    public final int A02;
    public final AnonymousClass1RZ A03 = new AnonymousClass1RZ();
    public final String A04;
    public final boolean A05;
    public final /* synthetic */ C27731Pn A06;

    private void A00(ImageView imageView, C88514Sz r12, AnonymousClass141 r13, float f, int i, boolean z) {
        String A0H;
        int i2 = i;
        if (i < 0 || i > 10000) {
            Log.e("contactPhotos/attempting to display invalid size, did you pass a resource ID?");
        }
        ImageView imageView2 = imageView;
        AnonymousClass141 r6 = r13;
        if (z) {
            C27731Pn r2 = this.A06;
            if (r2.A01.A0M(r13.A0H)) {
                A0H = imageView.getContext().getString(R.string.f12nameremoved);
            } else {
                A0H = r2.A04.A0H(r13);
            }
            imageView.setContentDescription(A0H);
        }
        float f2 = f;
        String A08 = r13.A08(f, i);
        boolean equals = A08.equals(imageView.getTag());
        imageView.setTag(A08);
        Bitmap bitmap = (Bitmap) this.A06.A05.A02.A01().A09(A08);
        C88514Sz r5 = r12;
        if (bitmap != null) {
            if (r13.A0G()) {
                StringBuilder sb = new StringBuilder();
                sb.append("contactPhotos/displaying from cache instead of fetching from server/jid = ");
                sb.append(r13.A0H);
                Log.i(sb.toString());
            }
            r12.Btf(bitmap, imageView, true);
            return;
        }
        if (!equals || !r13.A0f) {
            if (r13.A0G()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("contactPhotos/contact does not have photo, so show placeholder/jid = ");
                sb2.append(r13.A0H);
                Log.i(sb2.toString());
            }
            r12.Btv(imageView);
        }
        if (r13.A0f) {
            A01(imageView2, r5, r6, A08, f2, i2);
        }
    }

    private void A01(ImageView imageView, C88514Sz r14, Object obj, Object obj2, float f, int i) {
        A03(imageView);
        C608839s r2 = new C608839s(imageView, r14, obj, obj2, f, i);
        AnonymousClass1RZ r5 = this.A03;
        Stack stack = r5.A00;
        synchronized (stack) {
            stack.add(0, r2);
            stack.notifyAll();
            C50352kc r22 = this.A00;
            if (r22 == null || (this.A05 && r22.A08)) {
                String str = this.A04;
                C27731Pn r0 = this.A06;
                C50352kc r23 = new C50352kc(r0.A00, r0.A03, r5, r0.A06, r0.A07, r0.A08, r0.A09, str, this.A05);
                this.A00 = r23;
                r23.start();
            }
        }
    }

    public void A05(ImageView imageView, C62583Gs r13) {
        C62583Gs r7 = r13;
        ImageView imageView2 = imageView;
        imageView.setContentDescription(r13.A06);
        String obj = Long.valueOf(r13.A04).toString();
        imageView.setTag(obj);
        Bitmap bitmap = r13.A00;
        if (bitmap != null) {
            imageView.getDrawable();
            imageView.setImageBitmap(bitmap);
            return;
        }
        AnonymousClass141 r0 = r13.A01;
        if (r0 != null) {
            A08(imageView, r0);
            return;
        }
        C27731Pn r02 = this.A06;
        A01(imageView2, new C70133ee(r02.A02, (AnonymousClass141) null, r02.A0B, r02.A0C), r7, obj, this.A01, this.A02);
    }

    public void A09(ImageView imageView, AnonymousClass141 r3, int i) {
        A0A(imageView, r3, i, true);
    }

    public void A0C(ImageView imageView, C65643Sx r12) {
        C27731Pn r0 = this.A06;
        ImageView imageView2 = imageView;
        C65643Sx r7 = r12;
        A07(imageView2, new C70133ee(r0.A02, (AnonymousClass141) null, r0.A0B, r0.A0C), r7, this.A01, this.A02);
    }

    public AnonymousClass1RY(C27731Pn r2, String str, float f, int i, boolean z) {
        this.A06 = r2;
        this.A02 = i;
        this.A01 = f;
        this.A04 = str;
        this.A05 = z;
    }

    public void A02() {
        C50352kc r1 = this.A00;
        if (r1 != null) {
            r1.A08 = true;
            r1.interrupt();
            this.A00 = null;
        }
    }

    public void A03(ImageView imageView) {
        Stack stack = this.A03.A00;
        synchronized (stack) {
            int i = 0;
            while (i < stack.size()) {
                if (((C608839s) stack.get(i)).A04 == imageView) {
                    stack.remove(i);
                } else {
                    i++;
                }
            }
        }
    }

    public void A04(ImageView imageView, C16680pu r3, AnonymousClass141 r4, int i) {
        if (r4 == null) {
            imageView.setImageDrawable((Drawable) r3.get());
        } else {
            A09(imageView, r4, i);
        }
    }

    public void A06(ImageView imageView, C88514Sz r12, AnonymousClass141 r13, boolean z) {
        AnonymousClass141 r6 = r13;
        float f = this.A01;
        C27731Pn r0 = this.A06;
        if (r0.A0C.A03(r0.A0A.A05((GroupJid) r13.A06(GroupJid.class)))) {
            f = -2.14748365E9f;
        }
        A00(imageView, r12, r6, f, this.A02, z);
    }

    public void A08(ImageView imageView, AnonymousClass141 r3) {
        if (imageView != null) {
            A0B(imageView, r3, true);
        }
    }

    public void A0A(ImageView imageView, AnonymousClass141 r13, int i, boolean z) {
        AnonymousClass141 r7 = r13;
        float f = this.A01;
        C27731Pn r3 = this.A06;
        AnonymousClass1EM r2 = r3.A0C;
        if (r2.A03(r3.A0A.A05((GroupJid) r13.A06(GroupJid.class)))) {
            f = -2.14748365E9f;
        }
        A00(imageView, new C70133ee(r3.A02, r13, r3.A0B, r2), r7, f, i, z);
    }

    public void A0B(ImageView imageView, AnonymousClass141 r6, boolean z) {
        C27731Pn r0 = this.A06;
        A06(imageView, new C70133ee(r0.A02, r6, r0.A0B, r0.A0C), r6, z);
    }

    public void A07(ImageView imageView, C88514Sz r13, C65643Sx r14, float f, int i) {
        int length;
        ImageView imageView2 = imageView;
        imageView.setContentDescription(r14.A03());
        ArrayList arrayList = new ArrayList();
        List<C607439e> list = r14.A06;
        if (list != null) {
            for (C607439e r0 : list) {
                UserJid userJid = r0.A01;
                if (userJid != null) {
                    arrayList.add(userJid);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AnonymousClass11F r2 = (AnonymousClass11F) it.next();
            if (r2 instanceof PhoneUserJid) {
                C27731Pn r1 = this.A06;
                AnonymousClass141 A08 = r1.A03.A08(r2);
                if (A08 != null) {
                    A00(imageView2, new C70133ee(r1.A02, (AnonymousClass141) null, r1.A0B, r1.A0C), A08, f, i, true);
                    return;
                }
            }
        }
        byte[] bArr = r14.A0B;
        if (bArr == null || (length = bArr.length) <= 0) {
            r13.Btv(imageView);
        } else {
            r13.Btf(BitmapFactory.decodeByteArray(bArr, 0, length), imageView, true);
        }
    }
}
