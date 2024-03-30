package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6Pl  reason: invalid class name and case insensitive filesystem */
public class C131536Pl {
    public final C1273768a A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;
    public final Map A04;
    public final Map A05;
    public final Map A06;
    public final Map A07;

    public C131536Pl A01(Map map, Map map2) {
        Map map3 = map;
        Map map4 = map2;
        if (map == null) {
            if (map2 == null) {
                return this;
            }
            map3 = this.A06;
        } else if (map2 == null) {
            map4 = this.A07;
        }
        return new C131536Pl(this.A00, map3, this.A03, map4, this.A02, this.A01, this.A04, this.A05);
    }

    public C131536Pl A00(Map map) {
        HashMap hashMap = new HashMap(this.A07);
        hashMap.putAll(map);
        return new C131536Pl(this.A00, this.A06, this.A03, hashMap, this.A02, this.A01, this.A04, this.A05);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C131536Pl)) {
            return false;
        }
        C131536Pl r4 = (C131536Pl) obj;
        if (this.A03 == r4.A03 && this.A02 == r4.A02 && this.A06 == r4.A06 && this.A07.equals(r4.A07) && this.A01.equals(r4.A01) && this.A00.equals(r4.A00) && this.A04 == r4.A04 && this.A05 == r4.A05) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.A06.hashCode() ^ this.A03.hashCode()) ^ this.A07.hashCode()) ^ this.A02.hashCode()) ^ this.A01.hashCode()) ^ this.A00.hashCode()) ^ this.A04.hashCode()) ^ this.A05.hashCode();
    }

    public C131536Pl(C1273768a r1, Map map, Map map2, Map map3, Map map4, Map map5, Map map6, Map map7) {
        this.A06 = map;
        this.A03 = map2;
        this.A07 = map3;
        this.A02 = map4;
        this.A01 = map5;
        this.A00 = r1;
        this.A04 = map6;
        this.A05 = map7;
    }

    public C131536Pl() {
        this.A06 = Collections.emptyMap();
        this.A03 = Collections.emptyMap();
        this.A07 = Collections.emptyMap();
        this.A02 = Collections.emptyMap();
        this.A01 = Collections.emptyMap();
        this.A00 = AnonymousClass5ZH.A00(Collections.emptyMap());
        this.A04 = Collections.emptyMap();
        this.A05 = Collections.emptyMap();
    }
}
