package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.0T8  reason: invalid class name */
public class AnonymousClass0T8 {
    public int A00 = -1;
    public C07690Yx A01;
    public int A02;
    public ArrayList A03 = AnonymousClass001.A0I();

    public AnonymousClass0T8(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C33961gD.A06);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.A02 = obtainStyledAttributes.getResourceId(index, this.A02);
            } else if (index == 1) {
                this.A00 = obtainStyledAttributes.getResourceId(index, this.A00);
                String resourceTypeName = context.getResources().getResourceTypeName(this.A00);
                context.getResources().getResourceName(this.A00);
                if ("layout".equals(resourceTypeName)) {
                    C07690Yx r3 = new C07690Yx();
                    this.A01 = r3;
                    r3.A0B((ConstraintLayout) LayoutInflater.from(context).inflate(this.A00, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
