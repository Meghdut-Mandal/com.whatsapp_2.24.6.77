package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6Eg  reason: invalid class name and case insensitive filesystem */
public class C128956Eg {
    public final AnonymousClass5TE A00;
    public final List A01;
    public final List A02;
    public final List A03;
    public final List A04;
    public final String A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C128956Eg r5 = (C128956Eg) obj;
            if (!this.A05.equals(r5.A05) || !this.A01.equals(r5.A01) || this.A00 != r5.A00 || !this.A04.equals(r5.A04) || !this.A02.equals(r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.A05;
        objArr[1] = this.A01;
        objArr[2] = this.A00;
        objArr[3] = this.A04;
        objArr[4] = this.A02;
        return AnonymousClass000.A0M(C36411kG.A0t(), objArr, 5);
    }

    public C128956Eg(AnonymousClass6LQ r3) {
        this.A05 = r3.A01;
        this.A00 = r3.A00;
        this.A01 = r3.A02;
        this.A02 = r3.A03;
        List list = r3.A04;
        Collections.sort(list, C1504575i.A00);
        this.A03 = list;
        List list2 = r3.A05;
        Collections.sort(list2, C1504675j.A00);
        this.A04 = list2;
    }

    public JSONObject A00() {
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("mName", this.A05);
        A1B.put("mStartAtTimeUs", 0);
        A1B.put("mTrackType", this.A00.mValue);
        List<AnonymousClass6F1> list = this.A01;
        JSONArray A0u = C90524aI.A0u();
        for (AnonymousClass6F1 A002 : list) {
            A0u.put(A002.A00());
        }
        A1B.put("mSegments", A0u);
        List list2 = this.A04;
        JSONArray A0u2 = C90524aI.A0u();
        Iterator it = list2.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass001.A0A("toJSON");
        }
        A1B.put("mTimelineSpeedList", A0u2);
        List list3 = this.A03;
        JSONArray A0u3 = C90524aI.A0u();
        Iterator it2 = list3.iterator();
        if (it2.hasNext()) {
            it2.next();
            throw AnonymousClass001.A0A("toJSON");
        }
        A1B.put("mTimelinePtsMutatorList", A0u3);
        List list4 = this.A02;
        JSONArray A0u4 = C90524aI.A0u();
        Iterator it3 = list4.iterator();
        if (it3.hasNext()) {
            it3.next();
            throw AnonymousClass001.A0A("toJSON");
        }
        A1B.put("mTimelineEffects", A0u4);
        return A1B;
    }

    public String toString() {
        try {
            return A00().toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
