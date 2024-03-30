package X;

import android.util.Log;

/* renamed from: X.9kQ  reason: invalid class name and case insensitive filesystem */
public abstract class C201809kQ {
    public static final String[] A00 = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    public static C209289zl A00(C202309lW r2, String str, int i, boolean z, boolean z2) {
        int i2;
        r2.A0J(4);
        if (r2.A03() == 1684108385) {
            i2 = C202309lW.A01(r2, 8);
        } else {
            Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
            i2 = -1;
        }
        if (z2) {
            i2 = Math.min(1, i2);
        }
        if (i2 >= 0) {
            String num = Integer.toString(i2);
            if (z) {
                return new C1689182n(str, num);
            }
            return new C1689282o(str, num);
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Failed to parse uint8 attribute: ");
        Log.w("MetadataUtil", AnonymousClass000.A0q(C201069ij.A00(i), A0u));
        return null;
    }

    public static C1689182n A01(C202309lW r4, String str, int i) {
        int A03 = r4.A03();
        if (r4.A03() == 1684108385 && A03 >= 22) {
            r4.A0J(10);
            int A06 = r4.A06();
            if (A06 > 0) {
                String A0r = AnonymousClass000.A0r("", AnonymousClass000.A0u(), A06);
                int A062 = r4.A06();
                if (A062 > 0) {
                    A0r = AnonymousClass000.A0r("/", AnonymousClass000.A0v(A0r), A062);
                }
                return new C1689182n(str, A0r);
            }
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Failed to parse index/count attribute: ");
        Log.w("MetadataUtil", AnonymousClass000.A0q(C201069ij.A00(i), A0u));
        return null;
    }

    public static C1689182n A02(C202309lW r4, String str, int i) {
        int A03 = r4.A03();
        if (r4.A03() == 1684108385) {
            r4.A0J(8);
            return new C1689182n(str, r4.A0D(A03 - 16));
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Failed to parse text attribute: ");
        Log.w("MetadataUtil", AnonymousClass000.A0q(C201069ij.A00(i), A0u));
        return null;
    }
}
