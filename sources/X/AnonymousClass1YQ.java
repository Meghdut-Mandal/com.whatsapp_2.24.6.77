package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1YQ  reason: invalid class name */
public class AnonymousClass1YQ {
    public static final Object A0G = new Object();
    public int A00 = 0;
    public C198019cl A01;
    public final C18820ts A02;
    public final AnonymousClass16T A03;
    public final C24601Db A04;
    public final AnonymousClass1YS A05;
    public final AnonymousClass17Y A06;
    public final AnonymousClass16D A07;
    public final C20430xY A08;
    public final C19970wo A09;
    public final C19630wG A0A;
    public final C20810yC A0B;
    public final C29221Vu A0C;
    public final C29121Vk A0D;
    public final AnonymousClass1EU A0E;
    public final C19770wU A0F;

    public void A06(AnonymousClass9RV r20, boolean z) {
        C198299dE r7;
        AnonymousClass9RV r1 = r20;
        try {
            C199359fB A002 = A00();
            if (A002 != null) {
                long j = A002.A01;
                if (j > 0) {
                    AnonymousClass1YS r4 = this.A05;
                    ConcurrentHashMap concurrentHashMap = r4.A01;
                    concurrentHashMap.clear();
                    r4.A02();
                    if (z || (r7 = (C198299dE) concurrentHashMap.get(Long.valueOf(j))) == null || !A002.equals(r7.A08) || !C18820ts.A01(this.A02.A00).toString().equals(r7.A0D)) {
                        C193509Lt r9 = new C193509Lt(this.A06, this.A0A, this.A0C, this.A0D);
                        String obj = C18820ts.A01(this.A02.A00).toString();
                        C194939Rv r10 = new C194939Rv(r1, this, A002, obj);
                        C29121Vk r13 = r9.A03;
                        String A092 = r13.A06.A09();
                        C186018vH r12 = new C186018vH(Long.valueOf(j), A092, obj);
                        r13.A0G(new C178428fv(r9.A01.A00, r9.A02, r9, r10, r9.A00, r12), r12.A00, A092, AnonymousClass6X5.A0L);
                        return;
                    } else if (r20 != null) {
                        r1.A00(A02());
                        return;
                    } else {
                        return;
                    }
                }
            }
            this.A05.A01();
            if (r20 != null) {
                r1.A00((C198299dE) null);
            }
        } catch (JSONException e) {
            Log.e("PAY: PaymentIncentiveManager/getIncentiveOfferInfo : ", e);
            this.A05.A01();
            if (r20 != null) {
                Log.e("PAY: PaymentIncentiveManager/syncIncentiveData/refreshGetIncentiveOfferInfo failed");
                r1.A01.BWY();
            }
        }
    }

    public synchronized void A09(boolean z) {
        if (this.A00 == 1) {
            Log.i("PAY: PaymentIncentiveManager/syncIncentiveData iq requests have yet to be fulfilled, aborting this iq call");
        } else {
            this.A00 = 1;
            A06(new AnonymousClass9RV(new AEB(this), this, z), false);
        }
    }

    private C199359fB A00() {
        String A092 = this.A0B.A09(782);
        if (A092 == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(A092);
        return new C199359fB(jSONObject.getInt("update_count"), jSONObject.getLong("offer_id"));
    }

    public C198019cl A03() {
        C198019cl r0;
        synchronized (A0G) {
            r0 = this.A01;
        }
        return r0;
    }

    public void A04() {
        synchronized (A0G) {
            this.A01 = null;
            C24601Db r2 = this.A04;
            if (!TextUtils.isEmpty(r2.A03().getString("payment_incentive_user_claim_info", (String) null))) {
                r2.A03().edit().putString("payment_incentive_user_claim_info", (String) null).apply();
            }
        }
    }

    public void A07(B1V b1v, long j) {
        C193509Lt r7 = new C193509Lt(this.A06, this.A0A, this.A0C, this.A0D);
        long j2 = j;
        AnonymousClass9KZ r6 = new AnonymousClass9KZ(b1v, this, j2);
        r7.A03.A0H(new B7I(r7.A01.A00, r7.A02, r7.A00, r6, r7, 3), new C203399nx("account", new AnonymousClass1AL[]{new AnonymousClass1AL("action", "get-offer-eligibility"), new AnonymousClass1AL("offer_id", j2)}), "get", AnonymousClass6X5.A0L);
    }

    public void A08(B1V b1v, C203399nx r16, long j) {
        try {
            long j2 = j;
            C198019cl r8 = new C198019cl(r16, j2, C19970wo.A00(this.A09));
            synchronized (A0G) {
                C198299dE r6 = (C198299dE) this.A05.A01.get(Long.valueOf(j2));
                if (r6 != null && r6.A01 > 0) {
                    int i = 0;
                    if (((long) (r8.A00 + r8.A01)) >= r6.A05) {
                        i = 1;
                    }
                    r6.A01 = i;
                }
                this.A01 = r8;
                C24601Db r3 = this.A04;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("offer_id", r8.A03);
                jSONObject.put("is_eligible", r8.A04);
                jSONObject.put("pending_count", r8.A00);
                jSONObject.put("redeemed_count", r8.A01);
                jSONObject.put("last_sync_time_ms", r8.A02);
                r3.A03().edit().putString("payment_incentive_user_claim_info", jSONObject.toString()).apply();
            }
            if (b1v != null) {
                b1v.Bi8(r8);
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("processSuccessfulGetClaimStatus: Error while parsing: ");
            sb.append(e);
            Log.e(sb.toString());
            A04();
            if (b1v != null) {
                b1v.BWY();
            }
        }
    }

    public AnonymousClass1YQ(AnonymousClass17Y r4, AnonymousClass16D r5, C20430xY r6, C19970wo r7, C19630wG r8, C18820ts r9, AnonymousClass16T r10, C20810yC r11, C29221Vu r12, C24601Db r13, C29121Vk r14, AnonymousClass1EU r15, C19770wU r16) {
        this.A09 = r7;
        this.A0B = r11;
        this.A06 = r4;
        this.A0A = r8;
        this.A0F = r16;
        this.A02 = r9;
        this.A07 = r5;
        this.A0E = r15;
        this.A08 = r6;
        this.A04 = r13;
        this.A0D = r14;
        this.A03 = r10;
        this.A0C = r12;
        AnonymousClass1YS r0 = new AnonymousClass1YS(r7, r13);
        this.A05 = r0;
        r0.A02();
        String string = this.A04.A03().getString("payment_incentive_user_claim_info", (String) null);
        if (!TextUtils.isEmpty(string)) {
            try {
                synchronized (A0G) {
                    this.A01 = new C198019cl(string);
                }
            } catch (JSONException unused) {
                A04();
            }
        }
    }

    public AnonymousClass6O3 A01() {
        C198299dE A022 = A02();
        C198019cl A032 = A03();
        if (A022 == null || !(A032 == null || A032.A03 == A022.A08.A01)) {
            A04();
        }
        return new AnonymousClass6O3(A022, A03());
    }

    public C198299dE A02() {
        try {
            C199359fB A002 = A00();
            if (A002 == null || A002.A00 <= 0) {
                return null;
            }
            AnonymousClass1YS r3 = this.A05;
            long j = A002.A01;
            ConcurrentHashMap concurrentHashMap = r3.A01;
            Long valueOf = Long.valueOf(j);
            C198299dE r0 = (C198299dE) concurrentHashMap.get(valueOf);
            if (r0 != null) {
                return r0;
            }
            concurrentHashMap.clear();
            r3.A02();
            return (C198299dE) concurrentHashMap.get(valueOf);
        } catch (JSONException unused) {
            return null;
        }
    }

    public void A05(int i, int i2) {
        try {
            C198299dE A022 = A02();
            C199359fB A002 = A00();
            if (A022 != null && A002 != null) {
                if (i >= 0) {
                    A022.A00 = 1;
                }
                if (i2 >= 0) {
                    A022.A01 = i2;
                }
                this.A05.A03(A022, A002.A01);
            }
        } catch (Exception e) {
            Log.e("PAY: PaymentIncentiveManager/processUiOfferDetails : Error while parsing ", e);
        }
    }
}
