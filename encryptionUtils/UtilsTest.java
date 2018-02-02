package encryptionUtils;

import org.junit.Test;

public class UtilsTest {
    @Test
    public void md5Test() throws Exception {
        String content = "hello World";
        String md5String = MD5Util.getMD5String(content);
        System.out.println(md5String);
    }
}
