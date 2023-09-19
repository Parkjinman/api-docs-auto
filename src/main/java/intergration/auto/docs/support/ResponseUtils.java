package intergration.auto.docs.support;

import intergration.auto.docs.domain.common.Header;

import javax.servlet.http.HttpServletRequest;

public class ResponseUtils {

    public static Header setHeader(String message, String code,
                                   HttpServletRequest httpServletRequest) {
        Header header = new Header();
        header.setMessage(message);
        header.setRequestUrl(httpServletRequest.getRequestURI());
        header.setResultCode(code);
        return header;
    }
}
