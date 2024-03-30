package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.1Oy  reason: invalid class name and case insensitive filesystem */
public class C27611Oy {
    public Object A00(String str, Class cls) {
        Object obj;
        Object obj2;
        Object obj3;
        Object r4;
        Throwable th;
        Object obj4;
        AnonymousClass00C.A0D(cls, 1);
        C193469Lo r42 = AnonymousClass9B5.A00;
        try {
            obj = r42.A03.Bw0(str);
        } catch (Throwable th2) {
            obj = new AnonymousClass03N(th2);
        }
        if (obj instanceof AnonymousClass03N) {
            C177318db r0 = new C177318db("Parsing error", new Throwable[]{AnonymousClass0AK.A00(obj)});
            AnonymousClass00C.A0D(r0, 0);
            r4 = new AnonymousClass03N(r0);
        } else {
            AnonymousClass0AN.A00(obj);
            try {
                obj2 = r42.A02.Bw0(obj);
            } catch (Throwable th3) {
                obj2 = new AnonymousClass03N(th3);
            }
            try {
                obj3 = r42.A00.Bw0(obj);
            } catch (Throwable th4) {
                obj3 = new AnonymousClass03N(th4);
            }
            boolean z = obj2 instanceof AnonymousClass03N;
            if ((!z) && (!(obj3 instanceof AnonymousClass03N))) {
                AnonymousClass0AN.A00(obj3);
                AnonymousClass0AN.A00(obj2);
            } else if (z && (obj3 instanceof AnonymousClass03N)) {
                C177318db r02 = new C177318db("Failed to parse both 'data' and 'errors'", new Throwable[]{AnonymousClass0AK.A00(obj3), AnonymousClass0AK.A00(obj2)});
                AnonymousClass00C.A0D(r02, 0);
                r4 = new AnonymousClass03N(r02);
            } else if (obj3 instanceof AnonymousClass03N) {
                Throwable A00 = AnonymousClass0AK.A00(obj3);
                AnonymousClass0AN.A00(obj2);
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to parse ");
                sb.append("data");
                sb.append(" response due to ");
                sb.append(A00);
                C177318db r5 = new C177318db(obj2, sb.toString(), "data", A00, 472);
                AnonymousClass00C.A0D(r5, 0);
                r4 = new AnonymousClass03N(r5);
            } else {
                AnonymousClass0AN.A00(obj3);
                obj2 = r42.A01.Bw0(AnonymousClass0AK.A00(obj2));
            }
            r4 = new C195629Ve(obj3, obj2);
        }
        if (!(r4 instanceof AnonymousClass03N)) {
            AnonymousClass0AN.A00(r4);
            C195629Ve r43 = (C195629Ve) r4;
            Object A002 = r43.A00();
            AnonymousClass00C.A0D(A002, 0);
            try {
                obj4 = cls.getConstructor(new Class[]{JSONObject.class}).newInstance(new Object[]{A002});
            } catch (Throwable th5) {
                obj4 = new AnonymousClass03N(th5);
            }
            if (!(obj4 instanceof AnonymousClass03N)) {
                AnonymousClass0AN.A00(obj4);
                return new C177278dX((AnonymousClass9Y8) obj4, (JSONArray) r43.A01());
            }
            th = new C177298dZ(cls, AnonymousClass0AK.A00(obj4));
        } else {
            th = AnonymousClass0AK.A00(r4);
            if (th == null) {
                th = new C177318db((String) null, new Throwable[]{new UnknownError()});
            }
        }
        return new AnonymousClass03N(th);
    }
}
