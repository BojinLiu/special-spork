import com.yishi.ebl.common.data.response.Response;
import com.yishi.ebl.server.thirdparty.proxyinvoice.api.ProxyPaperInvoiceFacade;
import com.yishi.ebl.server.thirdparty.proxyinvoice.request.InvoiceProduct;
import com.yishi.ebl.server.thirdparty.proxyinvoice.request.ProxyApplyInvoiceRequest;
import org.junit.Test;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author liubojin
 * Created on 2018/4/11
 */
public class ProxyInvoiceApplyTest extends BaseTest {

    @Resource
    private ProxyPaperInvoiceFacade proxyPaperInvoiceFacade;

    /**
     * 测试代理开票
     */
    @Test
    public void testProxyInvoice() {

        ProxyApplyInvoiceRequest request = null;

        Random ran = new Random();
        for (int i = 0; i < 1; i++) {
            request = new ProxyApplyInvoiceRequest();
            request.setRequestId(ran.nextInt() + String.valueOf(System.currentTimeMillis()));
            request.setAppCode("NTI");
            request.setAccessToken("30203F018DE884BF19C0B693AE7039F7");
            request.setBuyerId("JDTQ001");
            //销售方会员ID
            request.setSellerId("360018012509555123");
            request.setSellerType("PERSON");
            request.setSellerAddress("销售方测试地址");
            List<InvoiceProduct> products = new ArrayList<InvoiceProduct>();
            InvoiceProduct pro = new InvoiceProduct();
            pro.setGoodsName("测试服务费");
            pro.setTaxClassificationCode("CFS0101");
            pro.setAmount(new BigDecimal(1230.89+i*10));
            products.add(pro);
            request.setInvoiceProductList(products);
            Response respone = proxyPaperInvoiceFacade.proxyApplyInvoice(request);
            System.out.println(respone.getCode());
            System.out.println(respone.getMessage());
        }
    }
}
