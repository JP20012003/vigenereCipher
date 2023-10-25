public class vigenereCipher {
static String encode(String text, final String key) {
String res = &quot;&quot;;
text = text.toUpperCase();
for (int i = 0, j = 0; i &lt; text.length(); i++) {
char c = text.charAt(i);
if (c &lt; &#39;A&#39; || c &gt; &#39;Z&#39;) {
continue;
}
res += (char) ((c + key.charAt(j) - 2 * &#39;A&#39;) % 26 + &#39;A&#39;);
j = ++j % key.length();
}
return res;
}
static String decode(String text, final String key) {
String res = &quot;&quot;;
text = text.toUpperCase();

for (int i = 0, j = 0; i &lt; text.length(); i++) {
char c = text.charAt(i);
if (c &lt; &#39;A&#39; || c &gt; &#39;Z&#39;) {
continue;
}
res += (char) ((c - key.charAt(j) + 26) % 26 + &#39;A&#39;);
j = ++j % key.length();
}
return res;
}
public static void main(String[] args) throws java.lang.Exception {
String key = &quot;VIGENERECIPHER&quot;;

String msg = &quot;SecurityLaboratory&quot;;
System.out.println(&quot;Simulating Vigenere Cipher\n------------------------&quot;);
System.out.println(&quot;Input Message :&quot; + msg);
String enc = encode(msg, key);
System.out.println(&quot;Encrypted Message :&quot; + enc);
System.out.println(&quot;Decrypted Message :&quot; + decode(enc, key));
}
}