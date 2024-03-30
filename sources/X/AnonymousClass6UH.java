package X;

/* renamed from: X.6UH  reason: invalid class name */
public abstract class AnonymousClass6UH {
    public static int A00(int i) {
        switch (i) {
            case -1:
                return 27;
            case 0:
            case 14:
            case 23:
                return 1;
            case 1:
                return 29;
            case 2:
                return 4;
            case 3:
                return 3;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 11:
                return 17;
            case 12:
                return 18;
            case 13:
                return 11;
            case 15:
                return 26;
            case 16:
                return 25;
            case 17:
                return 28;
            case 18:
                return 20;
            case 19:
                return 21;
            case 20:
                return 32;
            case 21:
                return 33;
            case 22:
                return 30;
            case 24:
                return 16;
            case 25:
                return 31;
            case 26:
                return 34;
            case 27:
                return 35;
            case 28:
                return 36;
            case 29:
                return 37;
            case 30:
                return 38;
            case 31:
                return 39;
            case 32:
                return 14;
            case 34:
                return 12;
            default:
                return 2;
        }
    }

    public static int A01(int i, int i2, boolean z) {
        if (i != 1) {
            int i3 = 5;
            int i4 = 4;
            if (i == 2) {
                return i2 == 1 ? i3 : i4;
            }
            if (i != 3) {
                if (i == 4) {
                    return 7;
                }
                if (i == 5) {
                    return 6;
                }
                i3 = 25;
                if (i != 25) {
                    i4 = 26;
                    if (i == 26) {
                        return 8;
                    }
                    if (i != 57) {
                        if (i == 58) {
                            return 42;
                        }
                        if (i != 62) {
                            if (i == 63) {
                                return 8;
                            }
                            if (i == 81) {
                                return 53;
                            }
                            if (i == 82) {
                                return 50;
                            }
                            switch (i) {
                                case 9:
                                    return 8;
                                case 16:
                                    return 14;
                                case 20:
                                    return 16;
                                case 23:
                                    return 18;
                                case 35:
                                    return 21;
                                case 49:
                                    return 28;
                                case 52:
                                    return 29;
                                case AnonymousClass8SX.CALL_LOG_MESSSAGE_FIELD_NUMBER /*69*/:
                                    return 43;
                                case AnonymousClass8SX.COMMENT_MESSAGE_FIELD_NUMBER /*77*/:
                                    return 57;
                                case 85:
                                    return 6;
                                case 100:
                                    return 20;
                                default:
                                    switch (i) {
                                        case 12:
                                            return 12;
                                        case 13:
                                            return 11;
                                        case 14:
                                            return 13;
                                        default:
                                            switch (i) {
                                                case 28:
                                                    break;
                                                case 29:
                                                    return 11;
                                                case 30:
                                                    return 6;
                                                default:
                                                    switch (i) {
                                                        case 42:
                                                            break;
                                                        case 43:
                                                            break;
                                                        case 44:
                                                            return 24;
                                                        case 45:
                                                            break;
                                                        case 46:
                                                            break;
                                                        default:
                                                            return z ? 9 : 1;
                                                    }
                                            }
                                    }
                            }
                        }
                    }
                }
            }
            return 3;
        }
        return 2;
    }

    public static long A02(Long l) {
        if (l == null) {
            return 0;
        }
        long longValue = l.longValue();
        if (longValue >= 0) {
            return Math.round(((double) longValue) / 1000.0d) * 1000;
        }
        return 0;
    }

    public static Long A03(Long l, boolean z) {
        long j;
        double d;
        double d2;
        if (l == null) {
            return null;
        }
        if (!z) {
            return l;
        }
        long longValue = l.longValue();
        if (longValue < 100) {
            d = (double) longValue;
            d2 = 50.0d;
        } else if (longValue < 1000) {
            d = (double) longValue;
            d2 = 100.0d;
        } else if (longValue < 10000) {
            d = (double) longValue;
            d2 = 1000.0d;
        } else if (longValue <= 20000) {
            d = (double) longValue;
            d2 = 5000.0d;
        } else {
            j = AnonymousClass6X5.A0L;
            return Long.valueOf(j);
        }
        j = (long) (Math.ceil(d / d2) * d2);
        return Long.valueOf(j);
    }
}
