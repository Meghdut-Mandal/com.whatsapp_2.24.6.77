package X;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.R;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0Ys  reason: invalid class name and case insensitive filesystem */
public class C07650Ys {
    public static int A03;
    public int A00 = -1;
    public int A01 = -1;
    public final AccessibilityNodeInfo A02;

    public static String A01(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH /*1024*/:
                return "ACTION_NEXT_HTML_ELEMENT";
            case EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH /*2048*/:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case ZipDecompressor.UNZIP_BUFFER_SIZE /*4096*/:
                return "ACTION_SCROLL_FORWARD";
            case DefaultCrypto.BUFFER_SIZE /*8192*/:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case C132986Wc.A0F /*131072*/:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            case 16908382:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case 16908372:
                                        return "ACTION_IME_ENTER";
                                    case 16908373:
                                        return "ACTION_DRAG_START";
                                    case 16908374:
                                        return "ACTION_DRAG_DROP";
                                    case 16908375:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r0 != null) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0029
            r2 = 0
            if (r5 == 0) goto L_0x0014
            boolean r0 = r5 instanceof X.C07650Ys
            if (r0 == 0) goto L_0x0014
            X.0Ys r5 = (X.C07650Ys) r5
            android.view.accessibility.AccessibilityNodeInfo r1 = r4.A02
            android.view.accessibility.AccessibilityNodeInfo r0 = r5.A02
            if (r1 != 0) goto L_0x0015
            if (r0 == 0) goto L_0x001c
        L_0x0014:
            return r2
        L_0x0015:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x001c
            return r2
        L_0x001c:
            int r1 = r4.A01
            int r0 = r5.A01
            if (r1 != r0) goto L_0x0014
            int r1 = r4.A00
            int r0 = r5.A00
            if (r1 == r0) goto L_0x0029
            return r2
        L_0x0029:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07650Ys.equals(java.lang.Object):boolean");
    }

    private ArrayList A02(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        ArrayList<Integer> integerArrayList = A00(accessibilityNodeInfo).getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList A0I = AnonymousClass001.A0I();
        A00(accessibilityNodeInfo).putIntegerArrayList(str, A0I);
        return A0I;
    }

    private void A03(int i, boolean z) {
        Bundle A002 = A00(this.A02);
        if (A002 != null) {
            int i2 = A002.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            A002.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    private boolean A04(int i) {
        Bundle A002 = A00(this.A02);
        if (A002 == null || (A002.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) != i) {
            return false;
        }
        return true;
    }

    public CharSequence A05() {
        if (!(!A02("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty())) {
            return this.A02.getText();
        }
        ArrayList A022 = A02("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList A023 = A02("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList A024 = A02("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList A025 = A02("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i = 0; i < A022.size(); i++) {
            spannableString.setSpan(new AnonymousClass0E9(this, AnonymousClass000.A0I(A025.get(i)), A00(accessibilityNodeInfo).getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), AnonymousClass000.A0I(A022.get(i)), AnonymousClass000.A0I(A023.get(i)), AnonymousClass000.A0I(A024.get(i)));
        }
        return spannableString;
    }

    public List A06() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.A02.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList A0I = AnonymousClass001.A0I();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            A0I.add(new AnonymousClass0Yd((C16710px) null, (CharSequence) null, (Class) null, actionList.get(i), 0));
        }
        return A0I;
    }

    public void A07(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.A02.setTraversalAfter(view);
        }
    }

    public void A08(View view, int i) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.A02.setTraversalBefore(view, i);
        }
    }

    public void A09(View view, CharSequence charSequence) {
        int length;
        int i;
        if (Build.VERSION.SDK_INT < 26) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
            A00(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            A00(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            A00(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            A00(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList A0I = AnonymousClass001.A0I();
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    if (((Reference) sparseArray.valueAt(i2)).get() == null) {
                        AnonymousClass000.A1F(A0I, i2);
                    }
                }
                for (int i3 = 0; i3 < A0I.size(); i3++) {
                    sparseArray.remove(AnonymousClass000.A0I(A0I.get(i3)));
                }
            }
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, charSequence.length(), ClickableSpan.class);
                if (clickableSpanArr != null && (length = clickableSpanArr.length) > 0) {
                    A00(accessibilityNodeInfo).putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                    SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                    }
                    int i4 = 0;
                    do {
                        ClickableSpan clickableSpan = clickableSpanArr[i4];
                        int i5 = 0;
                        while (true) {
                            if (i5 >= sparseArray2.size()) {
                                i = A03;
                                A03 = i + 1;
                                break;
                            } else if (clickableSpan.equals(((Reference) sparseArray2.valueAt(i5)).get())) {
                                i = sparseArray2.keyAt(i5);
                                break;
                            } else {
                                i5++;
                            }
                        }
                        sparseArray2.put(i, AnonymousClass001.A0F(clickableSpanArr[i4]));
                        ClickableSpan clickableSpan2 = clickableSpanArr[i4];
                        AnonymousClass000.A1F(A02("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY"), spanned.getSpanStart(clickableSpan2));
                        AnonymousClass000.A1F(A02("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY"), spanned.getSpanEnd(clickableSpan2));
                        AnonymousClass000.A1F(A02("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY"), spanned.getSpanFlags(clickableSpan2));
                        AnonymousClass000.A1F(A02("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY"), i);
                        i4++;
                    } while (i4 < length);
                }
            }
        }
    }

    public void A0A(AnonymousClass0Yd r3) {
        this.A02.addAction((AccessibilityNodeInfo.AccessibilityAction) r3.A03);
    }

    public void A0B(AnonymousClass0Yd r3) {
        this.A02.removeAction((AccessibilityNodeInfo.AccessibilityAction) r3.A03);
    }

    public void A0C(CharSequence charSequence) {
        this.A02.setClassName(charSequence);
    }

    public void A0D(CharSequence charSequence) {
        this.A02.setContentDescription(charSequence);
    }

    public void A0E(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        if (i >= 26) {
            accessibilityNodeInfo.setHintText(charSequence);
        } else {
            A00(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public void A0F(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        if (i >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequence);
        } else {
            A00(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void A0G(CharSequence charSequence) {
        A00(this.A02).putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public void A0H(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        if (i >= 30) {
            AnonymousClass0VQ.A01(accessibilityNodeInfo, charSequence);
        } else {
            A00(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public void A0I(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        if (i >= 28) {
            accessibilityNodeInfo.setTooltipText(charSequence);
        } else {
            A00(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY", charSequence);
        }
    }

    public void A0J(Object obj) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        if (obj == null) {
            collectionInfo = null;
        } else {
            collectionInfo = (AccessibilityNodeInfo.CollectionInfo) ((AnonymousClass0SK) obj).A00;
        }
        accessibilityNodeInfo.setCollectionInfo(collectionInfo);
    }

    public void A0K(Object obj) {
        this.A02.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((AnonymousClass0SL) obj).A00);
    }

    public void A0L(boolean z) {
        this.A02.setClickable(z);
    }

    public void A0M(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.A02.setHeading(z);
        } else {
            A03(2, z);
        }
    }

    public void A0N(boolean z) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.A02.setImportantForAccessibility(z);
        }
    }

    public void A0O(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.A02.setScreenReaderFocusable(z);
        } else {
            A03(1, z);
        }
    }

    public void A0P(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.A02.setShowingHintText(z);
        } else {
            A03(4, z);
        }
    }

    public boolean A0Q() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.A02.isShowingHintText();
        }
        return A04(4);
    }

    public int hashCode() {
        return AnonymousClass000.A0H(this.A02);
    }

    public C07650Ys(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.A02 = accessibilityNodeInfo;
    }

    public static Bundle A00(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtras();
    }

    public String toString() {
        CharSequence charSequence;
        CharSequence charSequence2;
        String string;
        boolean z;
        CharSequence charSequence3;
        boolean z2;
        boolean A04;
        boolean A042;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(super.toString());
        Rect A06 = AnonymousClass001.A06();
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        accessibilityNodeInfo.getBoundsInParent(A06);
        A0u.append(AnonymousClass000.A0l(A06, "; boundsInParent: ", AnonymousClass000.A0u()));
        accessibilityNodeInfo.getBoundsInScreen(A06);
        A0u.append(AnonymousClass000.A0l(A06, "; boundsInScreen: ", AnonymousClass000.A0u()));
        if (Build.VERSION.SDK_INT >= 34) {
            C07290Xb.A01(A06, accessibilityNodeInfo);
        } else {
            Rect rect = (Rect) A00(accessibilityNodeInfo).getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect != null) {
                A06.set(rect.left, rect.top, rect.right, rect.bottom);
            }
        }
        A0u.append(AnonymousClass000.A0l(A06, "; boundsInWindow: ", AnonymousClass000.A0u()));
        A0u.append("; packageName: ");
        A0u.append(accessibilityNodeInfo.getPackageName());
        A0u.append("; className: ");
        A0u.append(accessibilityNodeInfo.getClassName());
        A0u.append("; text: ");
        A0u.append(A05());
        A0u.append("; error: ");
        A0u.append(accessibilityNodeInfo.getError());
        A0u.append("; maxTextLength: ");
        A0u.append(accessibilityNodeInfo.getMaxTextLength());
        A0u.append("; stateDescription: ");
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            charSequence = AnonymousClass0VQ.A00(accessibilityNodeInfo);
        } else {
            charSequence = A00(accessibilityNodeInfo).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
        }
        A0u.append(charSequence);
        A0u.append("; contentDescription: ");
        A0u.append(accessibilityNodeInfo.getContentDescription());
        A0u.append("; tooltipText: ");
        if (i >= 28) {
            charSequence2 = accessibilityNodeInfo.getTooltipText();
        } else {
            charSequence2 = A00(accessibilityNodeInfo).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
        }
        A0u.append(charSequence2);
        A0u.append("; viewIdResName: ");
        A0u.append(accessibilityNodeInfo.getViewIdResourceName());
        A0u.append("; uniqueId: ");
        if (i >= 33) {
            string = AnonymousClass0VR.A00(accessibilityNodeInfo);
        } else {
            string = A00(accessibilityNodeInfo).getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        A0u.append(string);
        A0u.append("; checkable: ");
        A0u.append(accessibilityNodeInfo.isCheckable());
        A0u.append("; checked: ");
        A0u.append(accessibilityNodeInfo.isChecked());
        A0u.append("; focusable: ");
        A0u.append(accessibilityNodeInfo.isFocusable());
        A0u.append("; focused: ");
        A0u.append(accessibilityNodeInfo.isFocused());
        A0u.append("; selected: ");
        A0u.append(accessibilityNodeInfo.isSelected());
        A0u.append("; clickable: ");
        A0u.append(accessibilityNodeInfo.isClickable());
        A0u.append("; longClickable: ");
        A0u.append(accessibilityNodeInfo.isLongClickable());
        A0u.append("; contextClickable: ");
        if (i >= 23) {
            z = accessibilityNodeInfo.isContextClickable();
        } else {
            z = false;
        }
        A0u.append(z);
        A0u.append("; enabled: ");
        A0u.append(accessibilityNodeInfo.isEnabled());
        A0u.append("; password: ");
        A0u.append(accessibilityNodeInfo.isPassword());
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("; scrollable: ");
        A0u2.append(accessibilityNodeInfo.isScrollable());
        A0u.append(A0u2.toString());
        A0u.append("; containerTitle: ");
        if (i >= 34) {
            charSequence3 = C07290Xb.A00(accessibilityNodeInfo);
        } else {
            charSequence3 = A00(accessibilityNodeInfo).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
        }
        A0u.append(charSequence3);
        A0u.append("; granularScrollingSupported: ");
        A0u.append(A04(67108864));
        A0u.append("; importantForAccessibility: ");
        if (i >= 24) {
            z2 = accessibilityNodeInfo.isImportantForAccessibility();
        } else {
            z2 = true;
        }
        A0u.append(z2);
        A0u.append("; visible: ");
        A0u.append(accessibilityNodeInfo.isVisibleToUser());
        A0u.append("; isTextSelectable: ");
        if (i >= 33) {
            A04 = AnonymousClass0VR.A01(accessibilityNodeInfo);
        } else {
            A04 = A04(8388608);
        }
        A0u.append(A04);
        A0u.append("; accessibilityDataSensitive: ");
        if (i >= 34) {
            A042 = C07290Xb.A02(accessibilityNodeInfo);
        } else {
            A042 = A04(64);
        }
        A0u.append(A042);
        A0u.append("; [");
        List A062 = A06();
        for (int i2 = 0; i2 < A062.size(); i2++) {
            AnonymousClass0Yd r2 = (AnonymousClass0Yd) A062.get(i2);
            String A012 = A01(((AccessibilityNodeInfo.AccessibilityAction) r2.A03).getId());
            if (A012.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) r2.A03).getLabel() != null) {
                A012 = ((AccessibilityNodeInfo.AccessibilityAction) r2.A03).getLabel().toString();
            }
            A0u.append(A012);
            if (i2 != A062.size() - 1) {
                A0u.append(", ");
            }
        }
        return AnonymousClass000.A0q("]", A0u);
    }
}
