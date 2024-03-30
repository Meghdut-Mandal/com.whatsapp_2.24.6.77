package X;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Objects;

/* renamed from: X.9nT  reason: invalid class name and case insensitive filesystem */
public final class C203179nT {
    public int A00;
    public int A01 = 0;
    public int A02;
    public final C200279h2 A03;

    public static C200279h2 A02(C203179nT r1) {
        A07(r1, 0);
        return r1.A03;
    }

    public static C200279h2 A03(C203179nT r1) {
        A07(r1, 2);
        return r1.A03;
    }

    public void A0B(List list) {
        int A0G;
        int i = this.A02 & 7;
        if (i == 0) {
            do {
                C200279h2 r1 = this.A03;
                list.add(Boolean.valueOf(r1.A0U()));
                if (!r1.A0T()) {
                    A0G = r1.A0G();
                } else {
                    return;
                }
            } while (A0G == this.A02);
            this.A01 = A0G;
        } else if (i == 2) {
            C200279h2 r2 = this.A03;
            int A012 = A01(r2);
            do {
                list.add(Boolean.valueOf(r2.A0U()));
            } while (r2.A0A() < A012);
            A05(A012);
        } else {
            throw new AnonymousClass8SZ();
        }
    }

    public void A0C(List list) {
        int A0G;
        int i = this.A02 & 7;
        if (i == 1) {
            do {
                C200279h2 r2 = this.A03;
                list.add(Double.valueOf(r2.A08()));
                if (!r2.A0T()) {
                    A0G = r2.A0G();
                } else {
                    return;
                }
            } while (A0G == this.A02);
            this.A01 = A0G;
        } else if (i == 2) {
            C200279h2 r3 = this.A03;
            int A0H = r3.A0H();
            if ((A0H & 7) == 0) {
                int A0A = r3.A0A() + A0H;
                do {
                    list.add(Double.valueOf(r3.A08()));
                } while (r3.A0A() < A0A);
                return;
            }
            throw C165617ti.A0L("Failed to parse the message.");
        } else {
            throw new AnonymousClass8SZ();
        }
    }

    public void A0F(List list) {
        int A0G;
        int i = this.A02 & 7;
        if (i == 1) {
            do {
                C200279h2 r2 = this.A03;
                C165577te.A1Q(list, r2.A0J());
                if (!r2.A0T()) {
                    A0G = r2.A0G();
                } else {
                    return;
                }
            } while (A0G == this.A02);
            this.A01 = A0G;
        } else if (i == 2) {
            C200279h2 r3 = this.A03;
            int A0H = r3.A0H();
            if ((A0H & 7) == 0) {
                int A0A = r3.A0A() + A0H;
                do {
                    C165577te.A1Q(list, r3.A0J());
                } while (r3.A0A() < A0A);
                return;
            }
            throw C165617ti.A0L("Failed to parse the message.");
        } else {
            throw new AnonymousClass8SZ();
        }
    }

    public void A0G(List list) {
        int A0G;
        int i = this.A02 & 7;
        if (i == 2) {
            C200279h2 r2 = this.A03;
            int A002 = A00(r2);
            do {
                list.add(Float.valueOf(r2.A09()));
            } while (r2.A0A() < A002);
        } else if (i != 5) {
            throw new AnonymousClass8SZ();
        } else {
            do {
                C200279h2 r1 = this.A03;
                list.add(Float.valueOf(r1.A09()));
                if (!r1.A0T()) {
                    A0G = r1.A0G();
                } else {
                    return;
                }
            } while (A0G == this.A02);
            this.A01 = A0G;
        }
    }

    public void A0I(List list) {
        int A0G;
        int i = this.A02 & 7;
        if (i == 0) {
            do {
                C200279h2 r2 = this.A03;
                C165577te.A1Q(list, r2.A0K());
                if (!r2.A0T()) {
                    A0G = r2.A0G();
                } else {
                    return;
                }
            } while (A0G == this.A02);
            this.A01 = A0G;
        } else if (i == 2) {
            C200279h2 r3 = this.A03;
            int A012 = A01(r3);
            do {
                C165577te.A1Q(list, r3.A0K());
            } while (r3.A0A() < A012);
            A05(A012);
        } else {
            throw new AnonymousClass8SZ();
        }
    }

    public void A0K(List list) {
        int A0G;
        int i = this.A02 & 7;
        if (i == 1) {
            do {
                C200279h2 r2 = this.A03;
                C165577te.A1Q(list, r2.A0L());
                if (!r2.A0T()) {
                    A0G = r2.A0G();
                } else {
                    return;
                }
            } while (A0G == this.A02);
            this.A01 = A0G;
        } else if (i == 2) {
            C200279h2 r3 = this.A03;
            int A0H = r3.A0H();
            if ((A0H & 7) == 0) {
                int A0A = r3.A0A() + A0H;
                do {
                    C165577te.A1Q(list, r3.A0L());
                } while (r3.A0A() < A0A);
                return;
            }
            throw C165617ti.A0L("Failed to parse the message.");
        } else {
            throw new AnonymousClass8SZ();
        }
    }

    public void A0M(List list) {
        int A0G;
        int i = this.A02 & 7;
        if (i == 0) {
            do {
                C200279h2 r2 = this.A03;
                C165577te.A1Q(list, r2.A0M());
                if (!r2.A0T()) {
                    A0G = r2.A0G();
                } else {
                    return;
                }
            } while (A0G == this.A02);
            this.A01 = A0G;
        } else if (i == 2) {
            C200279h2 r3 = this.A03;
            int A012 = A01(r3);
            do {
                C165577te.A1Q(list, r3.A0M());
            } while (r3.A0A() < A012);
            A05(A012);
        } else {
            throw new AnonymousClass8SZ();
        }
    }

    public void A0O(List list) {
        int A0G;
        int i = this.A02 & 7;
        if (i == 0) {
            do {
                C200279h2 r2 = this.A03;
                C165577te.A1Q(list, r2.A0N());
                if (!r2.A0T()) {
                    A0G = r2.A0G();
                } else {
                    return;
                }
            } while (A0G == this.A02);
            this.A01 = A0G;
        } else if (i == 2) {
            C200279h2 r3 = this.A03;
            int A012 = A01(r3);
            do {
                C165577te.A1Q(list, r3.A0N());
            } while (r3.A0A() < A012);
            A05(A012);
        } else {
            throw new AnonymousClass8SZ();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ca, code lost:
        return java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d7, code lost:
        return java.lang.Long.valueOf(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A04(X.C203179nT r2, X.C201979ko r3, X.C188558zm r4, java.lang.Class r5) {
        /*
            int[] r1 = X.AnonymousClass99P.A00
            int r0 = r4.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L_0x0012;
                case 2: goto L_0x001f;
                case 3: goto L_0x0028;
                case 4: goto L_0x0037;
                case 5: goto L_0x0041;
                case 6: goto L_0x004c;
                case 7: goto L_0x0057;
                case 8: goto L_0x0066;
                case 9: goto L_0x006f;
                case 10: goto L_0x0078;
                case 11: goto L_0x008d;
                case 12: goto L_0x0098;
                case 13: goto L_0x00a3;
                case 14: goto L_0x00ac;
                case 15: goto L_0x00b5;
                case 16: goto L_0x00be;
                case 17: goto L_0x00cb;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.String r0 = "unsupported field type."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0012:
            X.9h2 r0 = A02(r2)
            boolean r0 = r0.A0U()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            return r1
        L_0x001f:
            X.9h2 r0 = A03(r2)
            X.AUx r1 = r0.A0O()
            return r1
        L_0x0028:
            r0 = 1
            A07(r2, r0)
            X.9h2 r0 = r2.A03
            double r0 = r0.A08()
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            return r1
        L_0x0037:
            X.9h2 r0 = A02(r2)
            int r0 = r0.A0B()
            goto L_0x00c6
        L_0x0041:
            r0 = 5
            A07(r2, r0)
            X.9h2 r0 = r2.A03
            int r0 = r0.A0C()
            goto L_0x00c6
        L_0x004c:
            r0 = 1
            A07(r2, r0)
            X.9h2 r0 = r2.A03
            long r0 = r0.A0J()
            goto L_0x00d3
        L_0x0057:
            r0 = 5
            A07(r2, r0)
            X.9h2 r0 = r2.A03
            float r0 = r0.A09()
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            return r1
        L_0x0066:
            X.9h2 r0 = A02(r2)
            int r0 = r0.A0D()
            goto L_0x00c6
        L_0x006f:
            X.9h2 r0 = A02(r2)
            long r0 = r0.A0K()
            goto L_0x00d3
        L_0x0078:
            r0 = 2
            A07(r2, r0)
            X.9e7 r0 = X.C198739e7.A02
            X.B3d r0 = r0.A00(r5)
            X.8Hz r1 = r0.BQ8()
            A09(r2, r3, r0, r1)
            r0.BP1(r1)
            return r1
        L_0x008d:
            r0 = 5
            A07(r2, r0)
            X.9h2 r0 = r2.A03
            int r0 = r0.A0E()
            goto L_0x00c6
        L_0x0098:
            r0 = 1
            A07(r2, r0)
            X.9h2 r0 = r2.A03
            long r0 = r0.A0L()
            goto L_0x00d3
        L_0x00a3:
            X.9h2 r0 = A02(r2)
            int r0 = r0.A0F()
            goto L_0x00c6
        L_0x00ac:
            X.9h2 r0 = A02(r2)
            long r0 = r0.A0M()
            goto L_0x00d3
        L_0x00b5:
            X.9h2 r0 = A03(r2)
            java.lang.String r1 = r0.A0Q()
            return r1
        L_0x00be:
            X.9h2 r0 = A02(r2)
            int r0 = r0.A0H()
        L_0x00c6:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            return r1
        L_0x00cb:
            X.9h2 r0 = A02(r2)
            long r0 = r0.A0N()
        L_0x00d3:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203179nT.A04(X.9nT, X.9ko, X.8zm, java.lang.Class):java.lang.Object");
    }

    private void A05(int i) {
        if (this.A03.A0A() != i) {
            throw C165587tf.A0J();
        }
    }

    public static void A06(int i) {
        if ((i & 3) != 0) {
            throw C165617ti.A0L("Failed to parse the message.");
        }
    }

    public static void A07(C203179nT r0, int i) {
        if ((r0.A02 & 7) != i) {
            throw new AnonymousClass8SZ();
        }
    }

    public static void A08(C203179nT r3, C201979ko r4, C23073B3d b3d, Object obj) {
        int i = r3.A00;
        r3.A00 = ((r3.A02 >>> 3) << 3) | 4;
        try {
            b3d.BPn(r3, r4, obj);
            if (r3.A02 != r3.A00) {
                throw C165617ti.A0L("Failed to parse the message.");
            }
        } finally {
            r3.A00 = i;
        }
    }

    public static void A09(C203179nT r4, C201979ko r5, C23073B3d b3d, Object obj) {
        C200279h2 r3 = r4.A03;
        int A0H = r3.A0H();
        int i = r3.A00;
        if (i < 100) {
            int A0I = r3.A0I(A0H);
            r3.A00 = i + 1;
            b3d.BPn(r4, r5, obj);
            r3.A0R(0);
            r3.A00--;
            r3.A0S(A0I);
            return;
        }
        throw C165617ti.A0L("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r2 != 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0A() {
        /*
            r3 = this;
            int r2 = r3.A01
            if (r2 == 0) goto L_0x0013
            r3.A02 = r2
            r0 = 0
            r3.A01 = r0
        L_0x0009:
            int r1 = r3.A00
            int r0 = r2 >>> 3
            if (r2 != r1) goto L_0x0012
        L_0x000f:
            r0 = 2147483647(0x7fffffff, float:NaN)
        L_0x0012:
            return r0
        L_0x0013:
            X.9h2 r0 = r3.A03
            int r2 = r0.A0G()
            r3.A02 = r2
            if (r2 == 0) goto L_0x000f
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203179nT.A0A():int");
    }

    public void A0D(List list) {
        int i;
        int A012;
        if (list instanceof AnonymousClass8I0) {
            AnonymousClass8I0 r4 = (AnonymousClass8I0) list;
            int i2 = this.A02 & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    C200279h2 r1 = this.A03;
                    A012 = A01(r1);
                    do {
                        r4.B0O(r1.A0B());
                    } while (r1.A0A() < A012);
                }
                throw new AnonymousClass8SZ();
            }
            do {
                C200279h2 r12 = this.A03;
                r4.B0O(r12.A0B());
                if (!r12.A0T()) {
                    i = r12.A0G();
                } else {
                    return;
                }
            } while (i == this.A02);
            this.A01 = i;
            return;
        }
        int i3 = this.A02 & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                C200279h2 r13 = this.A03;
                A012 = A01(r13);
                do {
                    C90504aG.A10(r13.A0B(), list);
                } while (r13.A0A() < A012);
            }
            throw new AnonymousClass8SZ();
        }
        do {
            C200279h2 r14 = this.A03;
            C90504aG.A10(r14.A0B(), list);
            if (!r14.A0T()) {
                i = r14.A0G();
            } else {
                return;
            }
        } while (i == this.A02);
        this.A01 = i;
        return;
        A05(A012);
    }

    public void A0E(List list) {
        int A0G;
        if (list instanceof AnonymousClass8I0) {
            AnonymousClass8I0 r4 = (AnonymousClass8I0) list;
            int i = this.A02 & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        C200279h2 r1 = this.A03;
                        r4.B0O(r1.A0C());
                        if (!r1.A0T()) {
                            A0G = r1.A0G();
                        } else {
                            return;
                        }
                    } while (A0G == this.A02);
                }
                throw new AnonymousClass8SZ();
            }
            C200279h2 r2 = this.A03;
            int A002 = A00(r2);
            do {
                r4.B0O(r2.A0C());
            } while (r2.A0A() < A002);
            return;
        }
        int i2 = this.A02 & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    C200279h2 r12 = this.A03;
                    C90504aG.A10(r12.A0C(), list);
                    if (!r12.A0T()) {
                        A0G = r12.A0G();
                    } else {
                        return;
                    }
                } while (A0G == this.A02);
            }
            throw new AnonymousClass8SZ();
        }
        C200279h2 r22 = this.A03;
        int A003 = A00(r22);
        do {
            C90504aG.A10(r22.A0C(), list);
        } while (r22.A0A() < A003);
        return;
        this.A01 = A0G;
    }

    public void A0H(List list) {
        int i;
        int A012;
        if (list instanceof AnonymousClass8I0) {
            AnonymousClass8I0 r4 = (AnonymousClass8I0) list;
            int i2 = this.A02 & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    C200279h2 r1 = this.A03;
                    A012 = A01(r1);
                    do {
                        r4.B0O(r1.A0D());
                    } while (r1.A0A() < A012);
                }
                throw new AnonymousClass8SZ();
            }
            do {
                C200279h2 r12 = this.A03;
                r4.B0O(r12.A0D());
                if (!r12.A0T()) {
                    i = r12.A0G();
                } else {
                    return;
                }
            } while (i == this.A02);
            this.A01 = i;
            return;
        }
        int i3 = this.A02 & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                C200279h2 r13 = this.A03;
                A012 = A01(r13);
                do {
                    C90504aG.A10(r13.A0D(), list);
                } while (r13.A0A() < A012);
            }
            throw new AnonymousClass8SZ();
        }
        do {
            C200279h2 r14 = this.A03;
            C90504aG.A10(r14.A0D(), list);
            if (!r14.A0T()) {
                i = r14.A0G();
            } else {
                return;
            }
        } while (i == this.A02);
        this.A01 = i;
        return;
        A05(A012);
    }

    public void A0J(List list) {
        int A0G;
        if (list instanceof AnonymousClass8I0) {
            AnonymousClass8I0 r4 = (AnonymousClass8I0) list;
            int i = this.A02 & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        C200279h2 r1 = this.A03;
                        r4.B0O(r1.A0E());
                        if (!r1.A0T()) {
                            A0G = r1.A0G();
                        } else {
                            return;
                        }
                    } while (A0G == this.A02);
                }
                throw new AnonymousClass8SZ();
            }
            C200279h2 r2 = this.A03;
            int A002 = A00(r2);
            do {
                r4.B0O(r2.A0E());
            } while (r2.A0A() < A002);
            return;
        }
        int i2 = this.A02 & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    C200279h2 r12 = this.A03;
                    C90504aG.A10(r12.A0E(), list);
                    if (!r12.A0T()) {
                        A0G = r12.A0G();
                    } else {
                        return;
                    }
                } while (A0G == this.A02);
            }
            throw new AnonymousClass8SZ();
        }
        C200279h2 r22 = this.A03;
        int A003 = A00(r22);
        do {
            C90504aG.A10(r22.A0E(), list);
        } while (r22.A0A() < A003);
        return;
        this.A01 = A0G;
    }

    public void A0L(List list) {
        int i;
        int A012;
        if (list instanceof AnonymousClass8I0) {
            AnonymousClass8I0 r4 = (AnonymousClass8I0) list;
            int i2 = this.A02 & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    C200279h2 r1 = this.A03;
                    A012 = A01(r1);
                    do {
                        r4.B0O(r1.A0F());
                    } while (r1.A0A() < A012);
                }
                throw new AnonymousClass8SZ();
            }
            do {
                C200279h2 r12 = this.A03;
                r4.B0O(r12.A0F());
                if (!r12.A0T()) {
                    i = r12.A0G();
                } else {
                    return;
                }
            } while (i == this.A02);
            this.A01 = i;
            return;
        }
        int i3 = this.A02 & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                C200279h2 r13 = this.A03;
                A012 = A01(r13);
                do {
                    C90504aG.A10(r13.A0F(), list);
                } while (r13.A0A() < A012);
            }
            throw new AnonymousClass8SZ();
        }
        do {
            C200279h2 r14 = this.A03;
            C90504aG.A10(r14.A0F(), list);
            if (!r14.A0T()) {
                i = r14.A0G();
            } else {
                return;
            }
        } while (i == this.A02);
        this.A01 = i;
        return;
        A05(A012);
    }

    public void A0N(List list) {
        int i;
        int A012;
        if (list instanceof AnonymousClass8I0) {
            AnonymousClass8I0 r4 = (AnonymousClass8I0) list;
            int i2 = this.A02 & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    C200279h2 r1 = this.A03;
                    A012 = A01(r1);
                    do {
                        r4.B0O(r1.A0H());
                    } while (r1.A0A() < A012);
                }
                throw new AnonymousClass8SZ();
            }
            do {
                C200279h2 r12 = this.A03;
                r4.B0O(r12.A0H());
                if (!r12.A0T()) {
                    i = r12.A0G();
                } else {
                    return;
                }
            } while (i == this.A02);
            this.A01 = i;
            return;
        }
        int i3 = this.A02 & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                C200279h2 r13 = this.A03;
                A012 = A01(r13);
                do {
                    C90504aG.A10(r13.A0H(), list);
                } while (r13.A0A() < A012);
            }
            throw new AnonymousClass8SZ();
        }
        do {
            C200279h2 r14 = this.A03;
            C90504aG.A10(r14.A0H(), list);
            if (!r14.A0T()) {
                i = r14.A0G();
            } else {
                return;
            }
        } while (i == this.A02);
        this.A01 = i;
        return;
        A05(A012);
    }

    public C203179nT(C200279h2 r3) {
        Charset charset = AnonymousClass9BD.A04;
        Objects.requireNonNull(r3, "input");
        this.A03 = r3;
        r3.A01 = this;
    }

    public static int A00(C200279h2 r2) {
        int A0H = r2.A0H();
        A06(A0H);
        return r2.A0A() + A0H;
    }

    public static int A01(C200279h2 r2) {
        return r2.A0A() + r2.A0H();
    }
}
