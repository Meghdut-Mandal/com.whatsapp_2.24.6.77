package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.json.JSONObject;

/* renamed from: X.6W9  reason: invalid class name */
public final class AnonymousClass6W9 {
    public Vector A00;
    public Vector A01;
    public JSONObject A02;
    public boolean A03 = true;
    public final AnonymousClass6YB A04 = new AnonymousClass6YB();
    public final HashMap A05 = AnonymousClass001.A0J();

    public static final Vector A00(AnonymousClass6W9 r6, HashMap hashMap, JSONObject jSONObject) {
        AnonymousClass6KF r1;
        Vector vector = new Vector();
        Iterator<String> keys = jSONObject.keys();
        AnonymousClass00C.A08(keys);
        while (keys.hasNext()) {
            String A0C = AnonymousClass001.A0C(keys);
            Object obj = jSONObject.get(A0C);
            if ((obj instanceof String) || (obj instanceof Double) || (obj instanceof Integer)) {
                if (!hashMap.containsKey(A0C)) {
                    int size = hashMap.size();
                    Integer valueOf = Integer.valueOf(size);
                    AnonymousClass00C.A0B(A0C);
                    hashMap.put(A0C, valueOf);
                    r1 = new AnonymousClass6KF(size, obj.toString());
                } else {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Multiple base values for variable ");
                    A0u.append(A0C);
                    throw AnonymousClass78L.A00(" in config file.", A0u);
                }
            } else if (obj instanceof JSONObject) {
                AnonymousClass6YB r0 = r6.A04;
                C36361kB.A1I(A0C);
                if (r0.A03.containsKey(A0C)) {
                    r1 = new AnonymousClass6KF(A0C, (List) A00(r6, hashMap, (JSONObject) obj));
                } else {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("Undeclared feature ");
                    A0u2.append(A0C);
                    throw AnonymousClass78L.A00(" used as condition in base_values.", A0u2);
                }
            } else {
                StringBuilder A0u3 = AnonymousClass000.A0u();
                A0u3.append("Variable ");
                A0u3.append(A0C);
                throw AnonymousClass78L.A00(" used in base_values has unexpected type.", A0u3);
            }
            vector.add(r1);
        }
        return vector;
    }

    public static final Vector A01(AnonymousClass6W9 r6, JSONObject jSONObject, boolean z) {
        AnonymousClass6KF r1;
        Vector vector = new Vector();
        Iterator<String> keys = jSONObject.keys();
        AnonymousClass00C.A08(keys);
        while (keys.hasNext()) {
            String A0C = AnonymousClass001.A0C(keys);
            if (!z || !AnonymousClass00C.A0J(A0C, "base_values")) {
                Object obj = jSONObject.get(A0C);
                if ((obj instanceof String) || (obj instanceof Double) || (obj instanceof Integer)) {
                    HashMap hashMap = r6.A05;
                    if (hashMap.containsKey(A0C)) {
                        AnonymousClass00C.A0B(A0C);
                        r1 = new AnonymousClass6KF(AnonymousClass000.A0I(C000200c.A00(A0C, hashMap)), obj.toString());
                    }
                } else if (obj instanceof JSONObject) {
                    AnonymousClass6YB r0 = r6.A04;
                    AnonymousClass00C.A0B(A0C);
                    AnonymousClass00C.A0D(A0C, 0);
                    if (r0.A03.containsKey(A0C)) {
                        r1 = new AnonymousClass6KF(A0C, (List) A01(r6, (JSONObject) obj, false));
                    } else if (z) {
                        vector.addAll(A01(r6, (JSONObject) obj, false));
                    } else {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("Undeclared feature ");
                        A0u.append(A0C);
                        throw AnonymousClass78L.A00(" used as condition in biz_multiply_values.", A0u);
                    }
                } else {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("Variable ");
                    A0u2.append(A0C);
                    throw AnonymousClass78L.A00(" used in biz_multiply_values has unexpected type.", A0u2);
                }
                vector.add(r1);
            }
        }
        return vector;
    }

    private final void A02(AnonymousClass6KF r7, ArrayList arrayList, C009003v r9) {
        List<AnonymousClass6KF> list = r7.A02;
        if (list == null) {
            String str = r7.A01;
            Integer num = r7.A00;
            if (num != null) {
                Double d = null;
                try {
                    if (AnonymousClass0RV.A00.A03(str)) {
                        d = Double.valueOf(Double.parseDouble(str));
                        if (d != null) {
                            int intValue = num.intValue();
                            Object obj = arrayList.get(intValue);
                            AnonymousClass00C.A08(obj);
                            arrayList.set(intValue, r9.invoke(obj, d));
                            return;
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                int intValue2 = num.intValue();
                Object obj2 = arrayList.get(intValue2);
                AnonymousClass00C.A08(obj2);
                arrayList.set(intValue2, r9.invoke(obj2, Double.valueOf(this.A04.A0A(str))));
                return;
            }
            throw new AnonymousClass78L("ValueModelConfigParser error! Rule tree leaf node has null index!");
        } else if (this.A04.A0A(r7.A01) != 0.0d) {
            for (AnonymousClass6KF A022 : list) {
                A02(A022, arrayList, r9);
            }
        }
    }

    public final double A03(ArrayList arrayList) {
        AnonymousClass6YB r4 = this.A04;
        int size = r4.A07.size();
        ArrayList A14 = C36441kJ.A14(size);
        for (int i = 0; i < size; i++) {
            A14.add(C90494aF.A0S());
        }
        r4.A01 = C36441kJ.A15(A14);
        int size2 = r4.A06.size();
        ArrayList A142 = C36441kJ.A14(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            A142.add(false);
        }
        r4.A00 = C36441kJ.A15(A142);
        int size3 = arrayList.size();
        Vector vector = r4.A09;
        if (size3 == vector.size()) {
            Iterator it = vector.iterator();
            while (it.hasNext()) {
                AnonymousClass011 r1 = (AnonymousClass011) it.next();
                int A08 = C90474aD.A08(r1);
                int A0H = C90484aE.A0H(r1);
                ArrayList arrayList2 = r4.A01;
                if (arrayList2 == null) {
                    throw C36331k8.A0d("outputValues");
                }
                arrayList2.set(A0H, arrayList.get(A08));
            }
            int size4 = this.A05.size();
            ArrayList A143 = C36441kJ.A14(size4);
            for (int i3 = 0; i3 < size4; i3++) {
                A143.add(C90494aF.A0S());
            }
            ArrayList A15 = C36441kJ.A15(A143);
            Vector vector2 = this.A00;
            if (vector2 == null) {
                throw C36331k8.A0d("baseValuesRuleTrees");
            }
            Iterator it2 = vector2.iterator();
            while (it2.hasNext()) {
                AnonymousClass6KF r12 = (AnonymousClass6KF) it2.next();
                AnonymousClass00C.A0B(r12);
                A02(r12, A15, C156477a2.A00);
            }
            Vector vector3 = this.A01;
            if (vector3 == null) {
                throw C36331k8.A0d("multiplierRuleTrees");
            }
            Iterator it3 = vector3.iterator();
            while (it3.hasNext()) {
                AnonymousClass6KF r13 = (AnonymousClass6KF) it3.next();
                AnonymousClass00C.A0B(r13);
                A02(r13, A15, C156487a3.A00);
            }
            Iterator it4 = A15.iterator();
            double d = 0.0d;
            while (it4.hasNext()) {
                d += C90504aG.A01(it4.next());
            }
            return d;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        C36341k9.A1N("input array has unexpected size. Expected: ", A0u, vector);
        C36341k9.A1N(". Actual: ", A0u, arrayList);
        throw new AnonymousClass78L(A0u.toString());
    }

    public AnonymousClass6W9(String str) {
        this.A02 = C36441kJ.A1C(str);
    }
}
