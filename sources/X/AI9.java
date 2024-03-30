package X;

import com.whatsapp.jid.UserJid;

public abstract class AI9 implements C236119d {
    public Long A00 = null;
    public String A01 = null;
    public final C27621Oz A02;
    public final C23068B2x A03;
    public final UserJid A04;

    public void A01(Integer num, Integer num2, String str, long j, boolean z) {
        int i;
        int intValue;
        int intValue2;
        C27621Oz r2 = this.A02;
        UserJid userJid = this.A04;
        if (this instanceof C180908mc) {
            i = 2;
        } else {
            i = 1;
        }
        r2.A00(userJid, num, num2, this.A00, this.A01, i);
        this.A01 = "RESET";
        if (z) {
            if (num2 == null) {
                intValue = 0;
            } else {
                intValue = num2.intValue();
                if (417 == intValue) {
                    this.A03.BWd(userJid, intValue);
                    return;
                }
            }
            if (num != null && (intValue2 = num.intValue()) != 200) {
                this.A03.BWd(userJid, intValue2);
                return;
            } else if (401 == intValue || 403 == intValue || 404 == intValue) {
                this.A03.BVG(userJid);
                return;
            }
        } else if (str != null) {
            this.A03.BhP(userJid, str, j);
            return;
        }
        this.A03.Bbh(userJid);
    }

    public void BVN(String str) {
        int i;
        C27621Oz r1 = this.A02;
        UserJid userJid = this.A04;
        if (this instanceof C180908mc) {
            i = 2;
        } else {
            i = 1;
        }
        r1.A00(userJid, 500, 500, this.A00, this.A01, i);
    }

    public AI9(C27621Oz r2, UserJid userJid, C23068B2x b2x) {
        this.A04 = userJid;
        this.A02 = r2;
        this.A03 = b2x;
    }

    public void A00(int i) {
        A01(Integer.valueOf(i), (Integer) null, (String) null, 0, true);
    }

    public void BWw(C203399nx r2, String str) {
        A00(AnonymousClass3ME.A00(r2));
    }
}
