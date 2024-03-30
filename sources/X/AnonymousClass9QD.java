package X;

/* renamed from: X.9QD  reason: invalid class name */
public abstract class AnonymousClass9QD {
    public B0V A00;
    public C200029gS A01;

    public String A00() {
        if (this instanceof AnonymousClass81S) {
            return "radialGradient";
        }
        if (this instanceof AnonymousClass81R) {
            return "linearGradient";
        }
        if (this instanceof C1686581l) {
            return "stop";
        }
        if (this instanceof C1686481k) {
            return "solidColor";
        }
        if (this instanceof C1687981z) {
            return "textPath";
        }
        if (this instanceof AnonymousClass820) {
            return "text";
        }
        if (this instanceof AnonymousClass821) {
            return "tspan";
        }
        if (this instanceof C1687881y) {
            return "tref";
        }
        if (this instanceof C1686081g) {
            return "mask";
        }
        if (this instanceof C1687481u) {
            return "view";
        }
        if (this instanceof C1687381t) {
            return "symbol";
        }
        if (this instanceof C1687281s) {
            return "svg";
        }
        if (this instanceof C1687681w) {
            return "pattern";
        }
        if (this instanceof C1687581v) {
            return "marker";
        }
        if (this instanceof C1687181r) {
            return "image";
        }
        if (this instanceof C1685981f) {
            C1685981f r1 = (C1685981f) this;
            if (r1 instanceof C1685481a) {
                return "use";
            }
            if (r1 instanceof AnonymousClass81Z) {
                return "switch";
            }
            if (r1 instanceof C1685581b) {
                return "defs";
            }
            if (r1 instanceof C1685681c) {
                return "clipPath";
            }
            return "group";
        } else if (this instanceof AnonymousClass81Y) {
            return "rect";
        } else {
            if (this instanceof AnonymousClass81U) {
                if (((AnonymousClass81U) this) instanceof C1685781d) {
                    return "polygon";
                }
                return "polyline";
            } else if (this instanceof AnonymousClass81T) {
                return "path";
            } else {
                if (this instanceof AnonymousClass81X) {
                    return "line";
                }
                if (this instanceof AnonymousClass81W) {
                    return "ellipse";
                }
                if (this instanceof AnonymousClass81V) {
                    return "circle";
                }
                return "";
            }
        }
    }
}
