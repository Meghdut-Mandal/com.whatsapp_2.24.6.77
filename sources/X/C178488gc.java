package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.8gc  reason: invalid class name and case insensitive filesystem */
public class C178488gc extends C178498gd {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ C23054B2a A02;
    public final /* synthetic */ C195479Ul A03;
    public final /* synthetic */ C107555Pk A04;
    public final /* synthetic */ Integer A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C178488gc(Context context, Context context2, AnonymousClass17Y r10, UserJid userJid, C29221Vu r12, AnonymousClass9YX r13, C23054B2a b2a, C195479Ul r15, C107555Pk r16, Integer num) {
        super(context, r10, r12, r13, "upi-get-vpa");
        this.A03 = r15;
        this.A04 = r16;
        this.A05 = num;
        this.A00 = context2;
        this.A01 = userJid;
        this.A02 = b2a;
    }

    private void A00(C202059ky r4) {
        AnonymousClass5GM r0 = this.A03.A0D;
        r0.A02.A01(r4, this.A05, "upi-get-vpa");
        C23054B2a b2a = this.A02;
        if (b2a != null) {
            b2a.BWg(r4);
        }
    }

    public void A07(C203399nx r28) {
        try {
            ArrayList arrayList = C186098vP.A00;
            C203399nx r2 = r28;
            C203399nx A0e = C90514aH.A0e(r2, this.A04);
            Class<String> cls = String.class;
            Long A0P = C165567td.A0P();
            Long A0Q = C165567td.A0Q();
            C203399nx r20 = r2;
            Class<String> cls2 = cls;
            C203379ns.A03(r20, cls2, A0P, A0Q, "upi-get-vpa", new String[]{"account", "action"}, false);
            C203379ns.A03(r20, cls2, A0P, A0Q, "1", new String[]{"account", "version"}, false);
            String[] strArr = {"account", PublicKeyCredentialControllerUtility.JSON_KEY_USER};
            C203539oF r19 = C203379ns.A00;
            Long A0Y = C90474aD.A0Y();
            Class<String> cls3 = cls;
            Object A0Z = r19.A0Z(r20, cls3, A0Y, C165577te.A0a(), (Object) null, new String[]{"account", "vpa"}, false);
            Long A0Z2 = C165577te.A0Z();
            Object A07 = C203539oF.A07(r20, cls3, A0Y, C165587tf.A0c(), (Object) null, new String[]{"account", "user-name"}, false);
            String A072 = C203379ns.A07(r2, "account", "nodal", C186098vP.A01);
            String A073 = C203379ns.A07(r2, "account", "nodal-allowed", C186098vP.A00);
            String A074 = C203379ns.A07(r2, "account", "notif-allowed", C186098vP.A02);
            C203539oF.A0B(r2, new C23214B9w(A0e, 3));
            C21599ARr aRr = C21599ARr.A00;
            AnonymousClass00C.A0D(r2, 0);
            C203539oF.A09(r2, aRr, new String[]{"account"}, 1, 1).get(0);
            C175698au r22 = new C175698au();
            r22.A04 = (UserJid) r19.A0Z(r20, UserJid.class, A0P, A0Q, (Object) null, strArr, false);
            r22.A01 = C165617ti.A0P(C146356vT.A00(), cls, A0Z, "upiHandle");
            r22.A02 = (String) r19.A0Z(r20, cls3, A0Y, A0Z2, (Object) null, new String[]{"account", "vpa-id"}, false);
            r22.A00 = C165617ti.A0P(C146356vT.A00(), cls, A07, "accountHolderName");
            boolean equals = A072.equals("1");
            r22.A03 = equals;
            r22.A04 = A073.equals("1");
            r22.A05 = A074.equals("1");
            if (equals) {
                r22.A01 = null;
                r22.A02 = null;
            }
            C195479Ul r9 = this.A03;
            AnonymousClass9YB A012 = r9.A0B.A01();
            C36391kE.A1Q(new C175608al(A012, r22), A012.A03);
            AnonymousClass5GM r8 = r9.A0D;
            r8.A04(this.A05, "upi-get-vpa");
            if (!r9.A03.A0E(3619) || !r22.A03) {
                C23054B2a b2a = this.A02;
                if (b2a != null) {
                    b2a.BUT(r22);
                    return;
                }
                return;
            }
            Context context = this.A00;
            UserJid userJid = this.A01;
            C23054B2a b2a2 = this.A02;
            AnonymousClass17Y r14 = r9.A00;
            AnonymousClass19A r13 = r9.A04;
            C29131Vl r7 = r9.A0E;
            C202269lR r6 = r9.A06;
            C29121Vk r5 = r9.A0A;
            AnonymousClass16T r3 = r9.A02;
            AnonymousClass17Y r15 = r14;
            AnonymousClass16T r16 = r3;
            Context context2 = context;
            AnonymousClass8gL r132 = new AnonymousClass8gL(context2, r15, r16, r13, r9.A05, r6, r9.A09, r5, r8, r7);
            try {
                r132.A01((C135086c7) null, C165617ti.A0P(C146356vT.A00(), cls, String.valueOf(C203559oI.A00().A0F(AnonymousClass3U8.A07(userJid), (String) null).nationalNumber_), "upiAlias"), new B9U(r22, b2a2, 0));
            } catch (AnonymousClass172 e) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Error parsing the number");
                C36321k7.A1Z(A0u, e.message);
            }
        } catch (C235919b unused) {
            Log.w("PAY: IndiaUpiContactActions : invalid node");
            A00(C202059ky.A00());
        }
    }

    public void A05(C202059ky r1) {
        super.A05(r1);
        A00(r1);
    }

    public void A06(C202059ky r1) {
        super.A06(r1);
        A00(r1);
    }
}
