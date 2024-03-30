package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.0EG  reason: invalid class name */
public class AnonymousClass0EG extends MenuInflater {
    public static final Class[] A04;
    public static final Class[] A05;
    public Context A00;
    public Object A01;
    public final Object[] A02;
    public final Object[] A03;

    static {
        Class[] clsArr = {Context.class};
        A05 = clsArr;
        A04 = clsArr;
    }

    public static Object A00(AnonymousClass0EG r1, Object obj) {
        if ((obj instanceof Activity) || !(obj instanceof ContextWrapper)) {
            return obj;
        }
        return A00(r1, ((ContextWrapper) obj).getBaseContext());
    }

    private void A01(AttributeSet attributeSet, Menu menu, XmlPullParser xmlPullParser) {
        AnonymousClass0Z0 r9 = new AnonymousClass0Z0(menu, this);
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int eventType = xmlPullParser2.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser2.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser2.getName();
                if (name.equals("menu")) {
                    int next = xmlPullParser2.next();
                    String str = null;
                    boolean z = false;
                    boolean z2 = false;
                    while (next != 1) {
                        if (next != 2) {
                            if (next == 3) {
                                String name2 = xmlPullParser2.getName();
                                if (z2 && name2.equals(str)) {
                                    str = null;
                                    z2 = false;
                                } else if (name2.equals("group")) {
                                    r9.A03 = 0;
                                    r9.A01 = 0;
                                    r9.A04 = 0;
                                    r9.A02 = 0;
                                    r9.A0C = true;
                                    r9.A0B = true;
                                } else if (name2.equals("item")) {
                                    if (!r9.A0D) {
                                        C06030Sa r0 = r9.A00;
                                        if (r0 == null || !((AnonymousClass0Gt) r0).A00.hasSubMenu()) {
                                            r9.A0D = true;
                                            AnonymousClass0Z0.A01(r9.A09.add(r9.A03, r9.A06, r9.A05, r9.A0A), r9);
                                        } else {
                                            r9.A0D = true;
                                            AnonymousClass0Z0.A01(r9.A09.addSubMenu(r9.A03, r9.A06, r9.A05, r9.A0A).getItem(), r9);
                                        }
                                    }
                                } else if (name2.equals("menu")) {
                                    z = true;
                                }
                            }
                        } else if (!z2) {
                            String name3 = xmlPullParser2.getName();
                            if (name3.equals("group")) {
                                r9.A02(attributeSet);
                            } else if (name3.equals("item")) {
                                r9.A03(attributeSet);
                            } else if (name3.equals("menu")) {
                                r9.A0D = true;
                                SubMenu addSubMenu = r9.A09.addSubMenu(r9.A03, r9.A06, r9.A05, r9.A0A);
                                AnonymousClass0Z0.A01(addSubMenu.getItem(), r9);
                                A01(attributeSet, addSubMenu, xmlPullParser2);
                            } else {
                                str = name3;
                                z2 = true;
                            }
                        }
                        next = xmlPullParser2.next();
                        if (z) {
                            return;
                        }
                    }
                } else {
                    throw new RuntimeException(AnonymousClass000.A0p("Expecting menu, got ", name, AnonymousClass000.A0u()));
                }
            }
        }
        throw new RuntimeException("Unexpected end of document");
    }

    public void inflate(int i, Menu menu) {
        InflateException inflateException;
        if (!(menu instanceof AnonymousClass07Z)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            XmlResourceParser layout = this.A00.getResources().getLayout(i);
            A01(Xml.asAttributeSet(layout), menu, layout);
            if (layout != null) {
                layout.close();
                return;
            }
            return;
        } catch (XmlPullParserException e) {
            inflateException = new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            inflateException = new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
        throw inflateException;
    }

    public AnonymousClass0EG(Context context) {
        super(context);
        this.A00 = context;
        Object[] A1b = AnonymousClass000.A1b(context);
        this.A03 = A1b;
        this.A02 = A1b;
    }
}
