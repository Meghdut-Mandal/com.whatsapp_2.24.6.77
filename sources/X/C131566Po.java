package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.whatsapp.R;
import java.io.File;
import java.lang.Thread;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.6Po  reason: invalid class name and case insensitive filesystem */
public abstract class C131566Po {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass17Y A02;
    public final C132416Tn A03;
    public final C160397kw A04;
    public final Object A05 = C36441kJ.A11();
    public final String A06;
    public final List A07;
    public final List A08;
    public final Map A09 = AnonymousClass001.A0J();
    public final Stack A0A = new Stack();
    public final Stack A0B = new Stack();

    public void A00(C160797lb r5) {
        synchronized (this.A05) {
            C124415y9 r2 = (C124415y9) this.A09.get(r5.getId());
            if (r2 != null && r5.getId().equals(r2.A03)) {
                r2.A05.remove(r5);
            }
        }
    }

    public void A01(C160797lb r9, boolean z) {
        String str;
        C160397kw r5 = this.A04;
        r5.Ba1(r9);
        C132416Tn r2 = this.A03;
        Bitmap A012 = r2.A01(r9.getId());
        ImageView BCZ = r9.BCZ();
        if (!(BCZ == null || BCZ.getTag(R.id.optin_for_bitmapool_caching) == null || !AnonymousClass000.A1X(BCZ.getTag(R.id.optin_for_bitmapool_caching)))) {
            ImageView BCZ2 = r9.BCZ();
            if (BCZ2 != null) {
                str = (String) BCZ2.getTag(R.id.previous_loaded_image_url);
            } else {
                str = null;
            }
            String id = r9.getId();
            if (str != null) {
                if (id == null || !TextUtils.equals(str, id)) {
                    synchronized (r2.A02) {
                        Bitmap A013 = r2.A01(str);
                        if (A013 != null) {
                            r2.A03.A00(A013.getWidth(), A013.getHeight(), str);
                        }
                    }
                }
            }
            if (r9.BCZ() != null) {
                r9.BCZ().setTag(R.id.previous_loaded_image_url, id);
            }
        }
        if (A012 != null) {
            if (A012 != C132416Tn.A07) {
                r5.Ba5(A012, r9, true);
                return;
            } else if (!z) {
                r5.BZu(r9);
                return;
            }
        }
        r5.BRN(r9);
        C18740tg.A01();
        synchronized (this.A05) {
            Map map = this.A09;
            C124415y9 r22 = (C124415y9) map.get(r9.getId());
            if (r22 == null) {
                r22 = new C124415y9(r9);
                map.put(r22.A03, r22);
            } else {
                r22.A05.put(r9, r9);
            }
            Stack stack = this.A0A;
            stack.remove(r22);
            this.A0B.remove(r22);
            stack.push(r22);
            synchronized (stack) {
                stack.notify();
            }
        }
        if (!this.A00) {
            for (Thread thread : this.A07) {
                if (thread.getState() == Thread.State.NEW) {
                    thread.start();
                }
            }
            this.A00 = true;
        }
        if (!this.A01) {
            for (Thread thread2 : this.A08) {
                if (thread2.getState() == Thread.State.NEW) {
                    thread2.start();
                }
            }
            this.A01 = true;
        }
    }

    public void A02(boolean z) {
        for (Thread interrupt : this.A08) {
            interrupt.interrupt();
        }
        for (Thread interrupt2 : this.A07) {
            interrupt2.interrupt();
        }
        this.A03.A05(z);
        this.A01 = false;
        this.A00 = false;
    }

    public C131566Po(AnonymousClass17Y r5, C160397kw r6, File file, String str, int i, long j) {
        this.A02 = r5;
        this.A06 = str;
        this.A03 = new C132416Tn(file, j);
        this.A04 = r6;
        this.A07 = C36441kJ.A14(i);
        this.A08 = C36441kJ.A14(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.A08.add(new AnonymousClass5N1(this, this.A06));
            this.A07.add(new AnonymousClass5N0(this, this.A06));
        }
    }
}
