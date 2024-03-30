package X;

import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.6N5  reason: invalid class name */
public final class AnonymousClass6N5 {
    public C1277869q A00;
    public final C19700wN A01;
    public final C19630wG A02;
    public final ReadWriteLock A03 = new ReentrantReadWriteLock();
    public final C19970wo A04;

    public final C1277869q A00() {
        String obj;
        C1277869q r0;
        C1277869q r6 = this.A00;
        if (r6 == null) {
            C19630wG r4 = this.A02;
            File A0w = C36441kJ.A0w(C90514aH.A0j(r4), "business_search");
            C90474aD.A15(A0w);
            if (!C36441kJ.A0w(A0w, "business_search_popular_businesses").exists()) {
                obj = null;
            } else {
                ReadWriteLock readWriteLock = this.A03;
                readWriteLock.readLock().lock();
                File A0w2 = C36441kJ.A0w(C90514aH.A0j(r4), "business_search");
                C90474aD.A15(A0w2);
                BufferedReader A0Z = C90504aG.A0Z(C36441kJ.A0w(A0w2, "business_search_popular_businesses"));
                StringBuilder A0u = AnonymousClass000.A0u();
                while (true) {
                    String readLine = A0Z.readLine();
                    if (readLine == null) {
                        break;
                    }
                    A0u.append(readLine);
                    A0u.append("\n");
                }
                A0Z.close();
                readWriteLock.readLock().unlock();
                obj = A0u.toString();
            }
            r6 = null;
            if (obj != null) {
                try {
                    JSONObject A1C = C36441kJ.A1C(obj);
                    JSONArray optJSONArray = A1C.optJSONArray("popular_businesses");
                    long optLong = A1C.optLong("last_updated");
                    ArrayList A0I = AnonymousClass001.A0I();
                    if (optJSONArray == null || optJSONArray.length() == 0 || optLong == 0) {
                        r0 = null;
                    } else {
                        int length = optJSONArray.length();
                        for (int i = 0; i < length; i++) {
                            JSONObject jSONObject = optJSONArray.getJSONObject(i);
                            String string = jSONObject.getString("jid");
                            String string2 = jSONObject.getString("verified_name");
                            AnonymousClass00C.A0B(string);
                            AnonymousClass00C.A0B(string2);
                            A0I.add(new C1277769p(string, string2));
                        }
                        r0 = new C1277869q(A0I, optLong);
                    }
                    r6 = r0;
                } catch (Exception e) {
                    Log.e("BusinessSearchPopularBusinessesManager/initialisePopularBizList/Failed!", e);
                    this.A01.A0E("BusinessSearchPopularBusinessesManager/initialisePopularBizList/Failed!", e.getMessage(), true);
                }
            }
            this.A00 = r6;
        }
        return r6;
    }

    public AnonymousClass6N5(C19700wN r2, C19970wo r3, C19630wG r4) {
        C36321k7.A11(r2, r4, r3);
        this.A01 = r2;
        this.A02 = r4;
        this.A04 = r3;
    }
}
