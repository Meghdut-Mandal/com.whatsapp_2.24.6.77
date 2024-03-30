package X;

/* renamed from: X.3Sd  reason: invalid class name */
public class AnonymousClass3Sd {
    public static C52082or A01(int i, int i2) {
        if (i == 1) {
            return C52082or.OK;
        }
        if (i == 2) {
            return C52082or.YES;
        }
        if (i != 3) {
            if (i == 4) {
                return C52082or.YES_WITH_CODE;
            }
        } else if (i2 == 2) {
            return C52082or.ERROR_BLOCKED;
        } else {
            if (i2 == 26) {
                return C52082or.ERROR_LIMITED_RELEASE;
            }
            if (i2 == 34) {
                return C52082or.ERROR_CODE_CHECKPOINT;
            }
            if (i2 == 23) {
                return C52082or.SECURITY_CODE;
            }
            if (i2 == 24) {
                return C52082or.ERROR_INVALID_SKEY_SIGNATURE;
            }
            if (i2 == 36) {
                return C52082or.ERROR_SEND_SMS_TO_WA;
            }
            if (i2 == 37) {
                return C52082or.ERROR_WAITING_FOR_SMS;
            }
            switch (i2) {
                case 6:
                    return C52082or.ERROR_TEMPORARILY_UNAVAILABLE;
                case 7:
                    return C52082or.ERROR_OLD_VERSION;
                case 8:
                    return C52082or.ERROR_TOO_RECENT;
                case 9:
                    return C52082or.ERROR_TOO_MANY;
                case 10:
                    return C52082or.ERROR_NEXT_METHOD;
                case 11:
                    return C52082or.ERROR_TOO_MANY_GUESSES;
                case 12:
                    return C52082or.ERROR_BAD_PARAMETER;
                case 13:
                    return C52082or.ERROR_MISSING_PARAMETER;
                case 14:
                    return C52082or.ERROR_PROVIDER_TIMEOUT;
                case 15:
                    return C52082or.ERROR_PROVIDER_UNROUTABLE;
                case 16:
                    return C52082or.ERROR_BAD_TOKEN;
                case 17:
                    return C52082or.ERROR_TOO_MANY_ALL_METHODS;
                case 18:
                    return C52082or.ERROR_NO_ROUTES;
                default:
                    switch (i2) {
                        case 29:
                            return C52082or.ERROR_FLASH_CALL_DISABLED;
                        case 30:
                            return C52082or.ERROR_DEVICE_CONFIRM_OR_SECOND_OTP;
                        case 31:
                            return C52082or.ERROR_SECOND_OTP;
                        case 32:
                            return C52082or.ERROR_NOT_ALLOWED;
                    }
            }
        }
        return C52082or.ERROR_UNSPECIFIED;
    }

    public static C52072oq A02(int i, int i2) {
        if (i == 1) {
            return C52072oq.YES;
        }
        if (i != 3) {
            if (i == 5) {
                return C52072oq.VERIFIED_STANDALONE;
            }
        } else if (i2 == 2) {
            return C52072oq.FAIL_BLOCKED;
        } else {
            if (i2 == 6) {
                return C52072oq.FAIL_TEMPORARILY_UNAVAILABLE;
            }
            if (i2 == 11) {
                return C52072oq.FAIL_TOO_MANY_GUESSES;
            }
            if (i2 == 26) {
                return C52072oq.ERROR_LIMITED_RELEASE;
            }
            switch (i2) {
                case 19:
                    return C52072oq.FAIL_MISMATCH;
                case 20:
                    return C52072oq.FAIL_GUESSED_TOO_FAST;
                case 21:
                    return C52072oq.FAIL_MISSING;
                case 22:
                    return C52072oq.FAIL_STALE;
                case 23:
                    return C52072oq.SECURITY_CODE;
                default:
                    switch (i2) {
                        case 30:
                            return C52072oq.DEVICE_CONFIRM_OR_SECOND_OTP;
                        case 31:
                            return C52072oq.SECOND_OTP;
                        case 32:
                            return C52072oq.FAIL_NOT_ALLOWED;
                    }
            }
        }
        return C52072oq.ERROR_UNSPECIFIED;
    }

    public static C52062op A00(int i) {
        if (i == 16) {
            return C52062op.ERROR_BAD_TOKEN;
        }
        if (i == 34) {
            return C52062op.CODE_CHECKPOINT;
        }
        if (i == 30) {
            return C52062op.DEVICE_CONFIRM_OR_SECOND_CODE;
        }
        if (i == 31) {
            return C52062op.SECOND_CODE;
        }
        switch (i) {
            case 1:
                return C52062op.INCORRECT;
            case 2:
                return C52062op.BLOCKED;
            case 3:
                return C52062op.LENGTH_LONG;
            case 4:
                return C52062op.LENGTH_SHORT;
            case 5:
                return C52062op.FORMAT_WRONG;
            case 6:
                return C52062op.TEMPORARILY_UNAVAILABLE;
            case 7:
                return C52062op.OLD_VERSION;
            default:
                switch (i) {
                    case 23:
                        return C52062op.SECURITY_CODE;
                    case 24:
                        return C52062op.INVALID_SKEY_SIGNATURE;
                    case 25:
                        return C52062op.BIZ_NOT_ALLOWED;
                    case 26:
                        return C52062op.LIMITED_RELEASE;
                    default:
                        return C52062op.UNKNOWN_REASON;
                }
        }
    }
}
