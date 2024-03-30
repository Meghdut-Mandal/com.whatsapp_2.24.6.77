package X;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6QD  reason: invalid class name */
public class AnonymousClass6QD {
    public boolean A00;
    public HashMap A01;
    public HashMap A02;
    public HashMap A03;
    public HashMap A04 = AnonymousClass001.A0J();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass6QD r5 = (AnonymousClass6QD) obj;
            HashMap hashMap = this.A02;
            HashMap hashMap2 = r5.A02;
            if (hashMap != hashMap2 && !AnonymousClass00C.A0J(hashMap, hashMap2)) {
                return false;
            }
            HashMap hashMap3 = this.A01;
            HashMap hashMap4 = r5.A01;
            return hashMap3 == hashMap4 || AnonymousClass00C.A0J(hashMap3, hashMap4);
        }
    }

    private void A00() {
        if (!this.A00) {
            Iterator A10 = C36391kE.A10(this.A02);
            while (A10.hasNext()) {
                HashMap A0J = AnonymousClass001.A0J();
                Iterator A102 = C36371kC.A10((AbstractMap) A10.next());
                while (A102.hasNext()) {
                    Map.Entry A11 = AnonymousClass000.A11(A102);
                    Object key = A11.getKey();
                    C128956Eg r2 = (C128956Eg) A11.getValue();
                    A0J.put(key, C36441kJ.A15(r2.A01));
                    this.A04.put(r2.A00, A0J);
                }
            }
            this.A00 = true;
        }
    }

    public AnonymousClass6QD(AnonymousClass62Y r3) {
        HashMap A0J = AnonymousClass001.A0J();
        this.A02 = A0J;
        A0J.putAll(r3.A02);
        HashMap A0J2 = AnonymousClass001.A0J();
        this.A01 = A0J2;
        A0J2.putAll(r3.A00);
        HashMap A0J3 = AnonymousClass001.A0J();
        this.A03 = A0J3;
        A0J3.putAll(r3.A01);
    }

    public C128956Eg A01(AnonymousClass5TE r2, int i) {
        A00();
        AbstractMap abstractMap = (AbstractMap) this.A02.get(r2);
        if (abstractMap != null) {
            return (C128956Eg) C90484aE.A0j(abstractMap, i);
        }
        return null;
    }

    public HashMap A02(AnonymousClass5TE r6) {
        HashMap A0J = AnonymousClass001.A0J();
        List A0n = C90524aI.A0n(r6, this.A01);
        if (A0n != null && !A0n.isEmpty()) {
            C36331k8.A1Q(A0n, A0J, -1);
        }
        HashMap A032 = A03(r6);
        if (A032 != null) {
            Iterator A10 = C36371kC.A10(A032);
            while (A10.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A10);
                Object key = A11.getKey();
                List list = ((C128956Eg) A11.getValue()).A02;
                if (!list.isEmpty()) {
                    A0J.put(key, list);
                }
            }
        }
        return A0J;
    }

    public HashMap A03(AnonymousClass5TE r3) {
        A00();
        HashMap hashMap = this.A02;
        if (hashMap.get(r3) != null) {
            return (HashMap) hashMap.get(r3);
        }
        return null;
    }

    public List A04(AnonymousClass5TE r2, int i) {
        A00();
        AbstractMap abstractMap = (AbstractMap) this.A04.get(r2);
        if (abstractMap != null) {
            return (List) C90484aE.A0j(abstractMap, i);
        }
        return null;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.A02;
        return AnonymousClass000.A0L(this.A01, A0M);
    }

    public String toString() {
        try {
            JSONObject A1B = C36441kJ.A1B();
            HashMap hashMap = this.A02;
            JSONArray A0u = C90524aI.A0u();
            Iterator A10 = C36371kC.A10(hashMap);
            while (A10.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A10);
                JSONObject A1B2 = C36441kJ.A1B();
                A1B2.put("TrackType", ((AnonymousClass5TE) A11.getKey()).mValue);
                JSONArray A0u2 = C90524aI.A0u();
                Iterator A102 = C36371kC.A10((AbstractMap) A11.getValue());
                while (A102.hasNext()) {
                    Map.Entry A112 = AnonymousClass000.A11(A102);
                    JSONObject A1B3 = C36441kJ.A1B();
                    A1B3.put("TrackIndex", A112.getKey());
                    A1B3.put("MediaTrackComposition", ((C128956Eg) A112.getValue()).A00());
                    A0u2.put(A1B3);
                }
                A1B2.put("TrackMap", A0u2);
                A0u.put(A1B2);
            }
            A1B.put("mTypeToTracksMap", A0u);
            HashMap hashMap2 = this.A01;
            JSONArray A0u3 = C90524aI.A0u();
            Iterator A103 = C36371kC.A10(hashMap2);
            while (A103.hasNext()) {
                Map.Entry A113 = AnonymousClass000.A11(A103);
                JSONObject A1B4 = C36441kJ.A1B();
                A1B4.put("TrackType", ((AnonymousClass5TE) A113.getKey()).mValue);
                JSONArray A0u4 = C90524aI.A0u();
                Iterator it = ((List) A113.getValue()).iterator();
                if (it.hasNext()) {
                    it.next();
                    throw AnonymousClass001.A0A("toJSON");
                }
                A1B4.put("TimelineEffects", A0u4);
                A0u3.put(A1B4);
            }
            return C90484aE.A0l(A0u3, "mTrackTypeToTimelineEffects", A1B);
        } catch (JSONException unused) {
            return "";
        }
    }
}
