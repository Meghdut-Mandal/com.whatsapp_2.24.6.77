package com.facebook.graphql.calls;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass84F;
import X.AnonymousClass84G;
import X.AnonymousClass9QK;
import X.C165567td;
import X.C36401kF;
import X.C36441kJ;
import X.C90494aF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public abstract class GraphQlCallInput {
    public static final AnonymousClass9QK A02 = new AnonymousClass9QK();
    public AnonymousClass84G A00 = null;
    public AnonymousClass9QK A01 = A02;

    private Object A00(Object obj) {
        ArrayList arrayList;
        String str;
        if (obj == null) {
            return null;
        }
        if (obj instanceof AnonymousClass84F) {
            ArrayList arrayList2 = ((AnonymousClass84F) obj).A00;
            if (arrayList2.size() > 0 && (C36441kJ.A12(arrayList2) instanceof AnonymousClass84G)) {
                ArrayList A0v = C36401kF.A0v(arrayList2);
                for (int i = 0; i < arrayList2.size(); i++) {
                    if (arrayList2.get(i) != null) {
                        A0v.add(A00(arrayList2.get(i)));
                    }
                }
                arrayList = A0v;
            } else if (arrayList2.size() <= 0 || !(C36441kJ.A12(arrayList2) instanceof AnonymousClass84F)) {
                ArrayList A0v2 = C36401kF.A0v(arrayList2);
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    Object obj2 = arrayList2.get(i2);
                    if (obj2 == null) {
                        str = null;
                        A0v2.add(str);
                    } else if (obj2 instanceof Number) {
                        A0v2.add(obj2);
                    } else {
                        str = obj2.toString();
                        A0v2.add(str);
                    }
                }
                arrayList = A0v2;
            } else {
                ArrayList A0v3 = C36401kF.A0v(arrayList2);
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    if (arrayList2.get(i3) != null) {
                        A0v3.add(A00(arrayList2.get(i3)));
                    }
                }
                arrayList = A0v3;
            }
        } else {
            boolean z = obj instanceof AnonymousClass84G;
            arrayList = obj;
            if (z) {
                TreeMap treeMap = new TreeMap();
                A01((AnonymousClass84G) obj, this, treeMap);
                return treeMap;
            }
        }
        return arrayList;
    }

    public static void A01(AnonymousClass84G r4, GraphQlCallInput graphQlCallInput, Map map) {
        if (r4 != null) {
            int i = 0;
            while (true) {
                int i2 = r4.A00;
                if (i >= i2) {
                    return;
                }
                if (i >= 0 && i < i2) {
                    ArrayList arrayList = r4.A01;
                    Object obj = arrayList.get(i * 2);
                    if (i < r4.A00) {
                        map.put(obj, graphQlCallInput.A00(arrayList.get((i * 2) + 1)));
                        i++;
                    } else {
                        throw new ArrayIndexOutOfBoundsException(i);
                    }
                }
            }
            throw new ArrayIndexOutOfBoundsException(i);
        }
    }

    public AnonymousClass84G A02() {
        AnonymousClass84G r0 = this.A00;
        if (r0 == null) {
            AnonymousClass9QK r1 = this.A01;
            r0 = (AnonymousClass84G) r1.A01.B09();
            if (r0 == null) {
                r0 = new AnonymousClass84G();
            }
            r0.A03(r1);
            this.A00 = r0;
        }
        return r0;
    }

    public void A03(AnonymousClass84F r5, List list) {
        if (list != null && !list.isEmpty()) {
            for (Object next : list) {
                if (next != null) {
                    if (next instanceof List) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            List list2 = (List) it.next();
                            AnonymousClass9QK r1 = r5.A01;
                            AnonymousClass84F r0 = (AnonymousClass84F) r1.A00.B09();
                            if (r0 == null) {
                                r0 = new AnonymousClass84F();
                            }
                            r0.A03(r1);
                            r5.A04(r0);
                            A03(r0, list2);
                        }
                        return;
                    } else if (next instanceof String) {
                        for (Object A002 : list) {
                            AnonymousClass84F.A00(r5, A002);
                        }
                        return;
                    } else if (next instanceof Boolean) {
                        for (Object A003 : list) {
                            AnonymousClass84F.A00(r5, A003);
                        }
                        return;
                    } else if (next instanceof Number) {
                        for (Object A004 : list) {
                            AnonymousClass84F.A00(r5, A004);
                        }
                        return;
                    } else if (next instanceof Enum) {
                        for (Object obj : list) {
                            AnonymousClass84F.A00(r5, obj.toString());
                        }
                        return;
                    } else if (next instanceof GraphQlCallInput) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            r5.A04(((GraphQlCallInput) it2.next()).A02());
                        }
                        return;
                    } else if (next instanceof Map) {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            Map map = (Map) it3.next();
                            AnonymousClass9QK r12 = r5.A01;
                            AnonymousClass84G r02 = (AnonymousClass84G) r12.A01.B09();
                            if (r02 == null) {
                                r02 = new AnonymousClass84G();
                            }
                            r02.A03(r12);
                            r5.A04(r02);
                            A04(r02, map);
                        }
                        return;
                    } else {
                        throw AnonymousClass001.A08(C165567td.A0W(next, "List value type is not supported: ", AnonymousClass000.A0u()));
                    }
                }
            }
        }
    }

    public void A04(AnonymousClass84G r6, Map map) {
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            String A0f = C90494aF.A0f(A11);
            String value = A11.getValue();
            if (value != null) {
                if (value instanceof Boolean) {
                    value = AnonymousClass000.A1X(value) ? "true" : "false";
                } else if (!(value instanceof Number) && !(value instanceof String)) {
                    if (value instanceof Enum) {
                        value = value.toString();
                    } else if (value instanceof GraphQlCallInput) {
                        r6.A04(((GraphQlCallInput) value).A02(), A0f);
                    } else if (value instanceof List) {
                        AnonymousClass9QK r1 = r6.A01;
                        AnonymousClass84F r0 = (AnonymousClass84F) r1.A00.B09();
                        if (r0 == null) {
                            r0 = new AnonymousClass84F();
                        }
                        r0.A03(r1);
                        r6.A04(r0, A0f);
                        A03(r0, (List) value);
                    } else if (value instanceof Map) {
                        AnonymousClass9QK r12 = r6.A01;
                        AnonymousClass84G r02 = (AnonymousClass84G) r12.A01.B09();
                        if (r02 == null) {
                            r02 = new AnonymousClass84G();
                        }
                        r02.A03(r12);
                        r6.A04(r02, A0f);
                        A04(r02, (Map) value);
                    } else {
                        throw AnonymousClass001.A08(C165567td.A0W(value, "Unexpected object value type ", AnonymousClass000.A0u()));
                    }
                }
                AnonymousClass84G.A00(r6, value, A0f);
            }
        }
    }

    public void A05(GraphQlCallInput graphQlCallInput, String str) {
        A02().A04(graphQlCallInput.A02(), str);
    }

    public void A06(String str, Integer num) {
        AnonymousClass84G.A00(A02(), num, str);
    }

    public void A07(String str, String str2) {
        AnonymousClass84G.A00(A02(), str2, str);
    }

    public void A08(String str, List list) {
        AnonymousClass84G A022 = A02();
        AnonymousClass9QK r1 = A022.A01;
        AnonymousClass84F r0 = (AnonymousClass84F) r1.A00.B09();
        if (r0 == null) {
            r0 = new AnonymousClass84F();
        }
        r0.A03(r1);
        A022.A04(r0, str);
        A03(r0, list);
    }
}
