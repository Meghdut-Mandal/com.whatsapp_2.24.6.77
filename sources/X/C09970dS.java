package X;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Method;

/* renamed from: X.0dS  reason: invalid class name and case insensitive filesystem */
public class C09970dS implements C17070qf {
    public static Class A01;
    public static Method A02;
    public static Method A03;
    public static boolean A04;
    public static boolean A05;
    public static boolean A06;
    public final View A00;

    public void BoT(View view, ViewGroup viewGroup) {
    }

    public static void A00() {
        if (!A06) {
            try {
                A01 = Class.forName("android.view.GhostView");
            } catch (ClassNotFoundException e) {
                Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e);
            }
            A06 = true;
        }
    }

    public void setVisibility(int i) {
        this.A00.setVisibility(i);
    }

    public C09970dS(View view) {
        this.A00 = view;
    }
}
