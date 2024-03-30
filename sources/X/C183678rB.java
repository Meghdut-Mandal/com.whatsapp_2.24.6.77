package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.8rB  reason: invalid class name and case insensitive filesystem */
public final class C183678rB extends C132446Tt {
    public final /* synthetic */ C207249un A00;
    public final /* synthetic */ C207119ua A01;
    public final /* synthetic */ C175928bI A02;
    public final /* synthetic */ C178678gv A03;
    public final /* synthetic */ AnonymousClass2bV A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public C183678rB(C207249un r1, C207119ua r2, C175928bI r3, C178678gv r4, AnonymousClass2bV r5, String str, String str2, boolean z) {
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A06 = str;
        this.A07 = z;
        this.A05 = str2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C29121Vk r1 = this.A03.A04;
        AnonymousClass2bV r7 = this.A04;
        C207119ua r0 = this.A01;
        return r1.A03(r0.A01, r0.A02, this.A00, this.A02, (C135106c9) null, r7, (String) null, this.A06, this.A07);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        HashMap A0J;
        String str;
        String str2;
        String str3;
        String str4;
        C175708av r1;
        AbstractCollection abstractCollection;
        AnonymousClass9K8 r10;
        Jid jid;
        Jid jid2;
        Jid jid3;
        C202319lY r14 = (C202319lY) obj;
        if (r14 != null) {
            C178678gv r0 = this.A03;
            String str5 = this.A05;
            AnonymousClass9F9 r2 = r0.A05;
            Object obj2 = r0.A08.get();
            AnonymousClass00C.A08(obj2);
            synchronized (r2) {
                r2.A00.put(str5, obj2);
            }
        }
        C178678gv r4 = this.A03;
        String str6 = null;
        if (r14 == null) {
            C159627jf r22 = r4.A00;
            if (r22 == null) {
                throw C36331k8.A0d("resourceResultCallback");
            }
            r4.A05(r22, "send_payment_failed", "send payment failed");
            return;
        }
        synchronized (r14) {
            A0J = AnonymousClass001.A0J();
            A0J.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r14.A0K);
            A0J.put("msg_key_remote_id", r14.A0C);
            A0J.put("msg_key_from_me", Boolean.valueOf(r14.A0Q));
            A0J.put("msg_key_id", r14.A0L);
            C36341k9.A1K("status", A0J, r14.A02);
            C36341k9.A1K(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A0J, r14.A03);
            C36421kH.A1K("updateTs", A0J, r14.A06);
            A0J.put("error_code", r14.A0J);
            A0J.put("sender", r14.A0E);
            A0J.put("receiver", r14.A0D);
            A0J.put("credential_id", r14.A0H);
            A0J.put("methods", r14.A0N);
            A0J.put("reqMsgKeyId", r14.A0M);
            A0J.put("metadata", r14.A0A);
            A0J.put("country", r14.A0G);
            C36341k9.A1K("version", A0J, r14.A04);
            A0J.put("interop", Boolean.valueOf(r14.A0P));
            A0J.put("background", r14.A0B);
            C36341k9.A1K("purchase_initiator", A0J, r14.A00);
        }
        Object obj3 = A0J.get("msg_key_remote_id");
        if (!(obj3 instanceof AnonymousClass11F) || (jid3 = (Jid) obj3) == null) {
            str = null;
        } else {
            str = jid3.getRawString();
        }
        A0J.put("msg_key_remote_id", str);
        Object obj4 = A0J.get("sender");
        if (!(obj4 instanceof UserJid) || (jid2 = (Jid) obj4) == null) {
            str2 = null;
        } else {
            str2 = jid2.getRawString();
        }
        A0J.put("sender", str2);
        Object obj5 = A0J.get("receiver");
        if (!(obj5 instanceof UserJid) || (jid = (Jid) obj5) == null) {
            str3 = null;
        } else {
            str3 = jid.getRawString();
        }
        A0J.put("receiver", str3);
        Object obj6 = A0J.get("methods");
        if (!(obj6 instanceof ArrayList) || (abstractCollection = (AbstractCollection) obj6) == null) {
            str4 = null;
        } else {
            JSONArray A0u = C90524aI.A0u();
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if ((next instanceof AnonymousClass9K8) && (r10 = (AnonymousClass9K8) next) != null) {
                    JSONObject A1B = C36441kJ.A1B();
                    A1B.put("amount", r10.A02.A01());
                    A1B.put("src_or_dst", r10.A00);
                    A1B.put("credential_id", r10.A01.A0A);
                    A0u.put(A1B);
                }
            }
            str4 = C36381kD.A0y(A0u);
        }
        A0J.put("methods", str4);
        Object obj7 = A0J.get("metadata");
        if ((obj7 instanceof C175928bI) && (r1 = (C175708av) obj7) != null) {
            str6 = r1.A0H();
        }
        A0J.put("metadata", str6);
        C159627jf r42 = r4.A00;
        if (r42 == null) {
            throw C36331k8.A0d("resourceResultCallback");
        }
        LinkedHashMap A1G = C36431kI.A1G();
        Iterator A10 = C36371kC.A10(A0J);
        while (A10.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A10);
            if (A11.getValue() != null) {
                C36411kG.A1T(A1G, A11);
            }
        }
        r42.BiH(C36391kE.A11("transaction", A1G));
    }
}
