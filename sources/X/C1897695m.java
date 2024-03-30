package X;

/* renamed from: X.95m  reason: invalid class name and case insensitive filesystem */
public abstract class C1897695m {
    public static boolean equalsImpl(B2P b2p, Object obj) {
        if (obj == b2p) {
            return true;
        }
        if (obj instanceof B2P) {
            return b2p.asMap().equals(((B2P) obj).asMap());
        }
        return false;
    }
}
