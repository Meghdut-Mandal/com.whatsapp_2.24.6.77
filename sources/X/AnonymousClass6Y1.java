package X;

/* renamed from: X.6Y1  reason: invalid class name */
public abstract class AnonymousClass6Y1 {
    public static C25471Gl A00(int i, boolean z) {
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    if (i == 9) {
                        return C25471Gl.A0B;
                    }
                    if (i == 13) {
                        return C25471Gl.A0C;
                    }
                    if (i == 26) {
                        return C25471Gl.A0e;
                    }
                    if (i != 57) {
                        if (i != 62) {
                            throw AnonymousClass000.A0d("media-file-type: The media type is not supported: type=", AnonymousClass000.A0u(), i);
                        }
                    }
                }
                return C25471Gl.A0j;
            }
            return C25471Gl.A0E;
        } else if (z) {
            return C25471Gl.A0W;
        } else {
            return C25471Gl.A0K;
        }
    }

    public static C25471Gl A01(AnonymousClass11F r4, int i, int i2) {
        if (i2 == 8) {
            if (i == 0 || i == 1) {
                return C25471Gl.A0o;
            }
            if (i == 3) {
                return C25471Gl.A0p;
            }
            if (i == 13) {
                return C25471Gl.A0n;
            }
            throw AnonymousClass000.A0d("media-file-type: The media type is not supported for origin=8: type=", AnonymousClass000.A0u(), i);
        } else if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 9) {
                        return C25471Gl.A0A;
                    }
                    if (i != 13) {
                        if (i != 20) {
                            if (i == 23) {
                                return C25471Gl.A0b;
                            }
                            if (i == 35) {
                                return C25471Gl.A0N;
                            }
                            if (i == 37) {
                                return C25471Gl.A08;
                            }
                            if (i == 57) {
                                return C25471Gl.A0G;
                            }
                            if (i == 65) {
                                return C25471Gl.A0Z;
                            }
                            if (i == 97) {
                                return C25471Gl.A0H;
                            }
                            if (i == 100) {
                                return C25471Gl.A0M;
                            }
                            if (i == 25) {
                                return C25471Gl.A0g;
                            }
                            if (i == 26) {
                                return C25471Gl.A0e;
                            }
                            if (i == 28) {
                                return C25471Gl.A0h;
                            }
                            if (i == 29) {
                                return C25471Gl.A0f;
                            }
                            if (i == 62) {
                                return C25471Gl.A0I;
                            }
                            if (i == 63) {
                                return C25471Gl.A0F;
                            }
                            if (i == 81) {
                                return C25471Gl.A0c;
                            }
                            if (i == 82) {
                                return C25471Gl.A0k;
                            }
                            switch (i) {
                                case 42:
                                    return C25471Gl.A0l;
                                case 43:
                                    return C25471Gl.A0m;
                                case 44:
                                    return C25471Gl.A0Y;
                                default:
                                    StringBuilder A0u = AnonymousClass000.A0u();
                                    A0u.append("media-file-type: The media type is not supported: type=");
                                    A0u.append(i);
                                    throw AnonymousClass000.A0d(", mediaOrigin=", A0u, i2);
                            }
                        } else if (r4 instanceof C28981Uw) {
                            return C25471Gl.A0V;
                        } else {
                            return C25471Gl.A0d;
                        }
                    } else if (r4 instanceof C28981Uw) {
                        return C25471Gl.A0S;
                    } else {
                        return C25471Gl.A04;
                    }
                } else if (r4 instanceof C28981Uw) {
                    return C25471Gl.A0X;
                } else {
                    return C25471Gl.A0i;
                }
            } else if (r4 instanceof C28981Uw) {
                if (i2 == 1) {
                    return C25471Gl.A0U;
                }
                return C25471Gl.A0Q;
            } else if (i2 == 1) {
                return C25471Gl.A0L;
            } else {
                return C25471Gl.A05;
            }
        } else if (i2 == 6) {
            return C25471Gl.A0J;
        } else {
            if (r4 instanceof C28981Uw) {
                return C25471Gl.A0T;
            }
            return C25471Gl.A0D;
        }
    }

    public static C25471Gl A02(AnonymousClass3T1 r3) {
        return A01(r3.A1J.A00, r3.A1I, r3.A09);
    }

    public static boolean A03(C25471Gl r2) {
        if (r2 == C25471Gl.A05 || r2 == C25471Gl.A0L || r2 == C25471Gl.A0Q || r2 == C25471Gl.A0U || r2 == C25471Gl.A0k) {
            return true;
        }
        return false;
    }

    public static boolean A04(C25471Gl r2) {
        if (r2 == C25471Gl.A0D || r2 == C25471Gl.A0l || r2 == C25471Gl.A0g || r2 == C25471Gl.A0b || r2 == C25471Gl.A08 || r2 == C25471Gl.A0J || r2 == C25471Gl.A0Z || r2 == C25471Gl.A0O || r2 == C25471Gl.A09 || r2 == C25471Gl.A0T || r2 == C25471Gl.A0G || r2 == C25471Gl.A0H) {
            return true;
        }
        return false;
    }

    public static boolean A05(C25471Gl r2) {
        if (r2 == C25471Gl.A0D || r2 == C25471Gl.A0l || r2 == C25471Gl.A0J || r2 == C25471Gl.A0b || r2 == C25471Gl.A08 || r2 == C25471Gl.A0O || r2 == C25471Gl.A09 || r2 == C25471Gl.A0T || r2 == C25471Gl.A0G || r2 == C25471Gl.A0H) {
            return true;
        }
        return false;
    }

    public static boolean A06(C25471Gl r2) {
        if (r2 == C25471Gl.A0T || r2 == C25471Gl.A0X || r2 == C25471Gl.A0W || r2 == C25471Gl.A0U || r2 == C25471Gl.A0Q || r2 == C25471Gl.A0R || r2 == C25471Gl.A0S || r2 == C25471Gl.A0V) {
            return true;
        }
        return false;
    }

    public static boolean A07(C25471Gl r2) {
        if (r2 == C25471Gl.A0d || r2 == C25471Gl.A0V) {
            return true;
        }
        return false;
    }

    public static boolean A08(C25471Gl r2) {
        if (r2 == C25471Gl.A0i || r2 == C25471Gl.A0m || r2 == C25471Gl.A0P || r2 == C25471Gl.A0c || r2 == C25471Gl.A0X || r2 == C25471Gl.A0I) {
            return true;
        }
        return false;
    }

    public static boolean A09(C25471Gl r2) {
        if (A08(r2) || r2 == C25471Gl.A04 || r2 == C25471Gl.A0S) {
            return true;
        }
        return false;
    }

    public static boolean A0A(C25471Gl r2) {
        if (A09(r2) || r2 == C25471Gl.A0h || r2 == C25471Gl.A0f) {
            return true;
        }
        return false;
    }
}
