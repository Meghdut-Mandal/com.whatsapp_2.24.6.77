package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6sZ  reason: invalid class name and case insensitive filesystem */
public class C144636sZ implements C30631aW {
    public final AnonymousClass13S A00;

    public /* synthetic */ void BV2() {
    }

    public void BV3() {
        Map map;
        AnonymousClass13S r5 = this.A00;
        C19730wQ r0 = r5.A01;
        r0.A0G();
        if (r0.A00 != null) {
            String A09 = r5.A07.A09(2804);
            if (AnonymousClass14B.A0F(A09)) {
                map = Collections.emptyMap();
            } else {
                HashMap A0J = AnonymousClass001.A0J();
                try {
                    JSONObject A1C = C36441kJ.A1C(A09);
                    Iterator<String> keys = A1C.keys();
                    while (keys.hasNext()) {
                        String A0C = AnonymousClass001.A0C(keys);
                        C36341k9.A1K(A0C, A0J, A1C.getInt(A0C));
                    }
                    map = A0J;
                } catch (JSONException e) {
                    C90464aC.A1L("DatabaseMigrationManager/parseKnownVersions/malformed json ", A09, AnonymousClass000.A0u(), e);
                    r5.A00.A0E("db-migration-parse-known-versions/malformed", e.getMessage(), false);
                    map = A0J;
                }
            }
            if (!map.isEmpty()) {
                C225614x it = r5.A06.A00().values().iterator();
                while (it.hasNext()) {
                    C227415p r2 = (C227415p) it.next();
                    if (r2.A0C()) {
                        int i = r2.A00;
                        String str = r2.A05;
                        Number A0b = C90524aI.A0b(str, map);
                        if (A0b != null && A0b.intValue() > i) {
                            C36321k7.A1Q("DatabaseMigrationManager/analyzeStuckMigrations/need to upgrade app because of ", str, AnonymousClass000.A0u());
                            r5.A02.A01(C19970wo.A00(r5.A03) + 1209600000);
                            return;
                        }
                    }
                }
            }
        }
    }

    public C144636sZ(AnonymousClass13S r1) {
        this.A00 = r1;
    }
}
