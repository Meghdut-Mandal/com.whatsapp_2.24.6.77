package X;

import android.app.Activity;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageButton;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.R;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.mentions.MentionableEntry;

/* renamed from: X.5yO  reason: invalid class name and case insensitive filesystem */
public class C124555yO {
    public final View A00;
    public final View A01;
    public final ViewTreeObserver.OnGlobalLayoutListener A02;
    public final ImageButton A03;
    public final C88314Sf A04;
    public final AnonymousClass22t A05;
    public final AnonymousClass3J6 A06;
    public final MentionableEntry A07;
    public final AnonymousClass1N2 A08;

    public C124555yO(Activity activity, View view, C19700wN r39, C21060yb r40, C19420v0 r41, C18820ts r42, AnonymousClass1N0 r43, C1261362r r44, AnonymousClass6O1 r45, AnonymousClass1XN r46, AnonymousClass1H2 r47, EmojiSearchProvider emojiSearchProvider, C20810yC r49, AnonymousClass11F r50, C19890wg r51, AnonymousClass1N2 r52) {
        C163357q4 r3 = new C163357q4(this, 1);
        this.A04 = r3;
        C164757sK r2 = new C164757sK(this, 11);
        this.A02 = r2;
        View view2 = view;
        this.A01 = view2;
        AnonymousClass1N2 r6 = r52;
        this.A08 = r6;
        this.A00 = view2.findViewById(R.id.emoji_btn_holder);
        MentionableEntry mentionableEntry = (MentionableEntry) C012005e.A02(view2, R.id.comment);
        this.A07 = mentionableEntry;
        mentionableEntry.setInputEnterAction(6);
        mentionableEntry.setFilters(new InputFilter[]{new C66763Xf(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH)});
        mentionableEntry.setOnEditorActionListener(new C163057pa(this, 2));
        AnonymousClass1H2 r19 = r47;
        C19890wg r22 = r51;
        C21060yb r13 = r40;
        C18820ts r15 = r42;
        mentionableEntry.addTextChangedListener(new AnonymousClass2gA(mentionableEntry, C36391kE.A0O(view2, R.id.counter), r13, r15, r43, r19, r22, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, 30, true, false, false));
        AnonymousClass11F r5 = r50;
        if (mentionableEntry.A0I(r5)) {
            mentionableEntry.A0G(C36411kG.A0O(view2, R.id.mention_attach), r5, false, true, true, false);
        }
        ImageButton imageButton = (ImageButton) view2.findViewById(R.id.emoji_picker_btn);
        this.A03 = imageButton;
        Activity activity2 = activity;
        EmojiSearchProvider emojiSearchProvider2 = emojiSearchProvider;
        C19700wN r10 = r39;
        C19420v0 r14 = r41;
        C1261362r r16 = r44;
        AnonymousClass6O1 r17 = r45;
        AnonymousClass1XN r18 = r46;
        AnonymousClass22t r7 = new AnonymousClass22t(activity2, imageButton, r10, (C87484Oz) activity2.findViewById(R.id.main), mentionableEntry, r13, r14, r15, r16, r17, r18, r19, emojiSearchProvider2, r49, r22, r6, 19, C54212sa.A00(r5));
        this.A05 = r7;
        AnonymousClass3J6 r62 = new AnonymousClass3J6(activity2, r7, (EmojiSearchContainer) view2.findViewById(R.id.emoji_search_container));
        this.A06 = r62;
        r62.A00 = new C164097rG(this, 1);
        r7.A0H(r3);
        r7.A0F = new C1503074t((Object) this, 5);
        view2.getViewTreeObserver().addOnGlobalLayoutListener(r2);
    }
}
