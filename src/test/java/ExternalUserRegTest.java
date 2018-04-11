import com.yishi.ebl.common.data.code.CertificateTypeEnum;
import com.yishi.ebl.common.data.response.Response;
import com.yishi.ebl.server.thirdparty.api.ExternalRegFacade;
import com.yishi.ebl.server.thirdparty.request.ExternalRegRequest;
import com.yishi.ebl.server.thirdparty.response.ExternalRegResponse;
import org.junit.Test;

import javax.annotation.Resource;

public class ExternalUserRegTest extends BaseTest{

    @Resource
    private ExternalRegFacade externalRegFacade;

    @Test
    public void testUserReg() {

        ExternalRegRequest regQuest = new ExternalRegRequest();
        regQuest.setAppCode("STB");
        regQuest.setAccessToken("8123F395CCB2A7FE03330EDEBE199F1D");
        regQuest.setRequestId(String.valueOf(System.currentTimeMillis()));
        regQuest.setName("www");
        regQuest.setTelephone("15236529112" +
                "");
        regQuest.setCertType(CertificateTypeEnum.ID_CARD.getCode());
        regQuest.setCertNo("230105199507111011");
        regQuest.setCertPicF("mulitImg029bf945-8eb6-4647-aeed-0e8038b4a82f_8903477341767617532.jpg");
        regQuest.setCertPicB("mulitImg029bf945-8eb6-4647-aeed-0e8038b4a82f_8903477341767617532.jpg");
        regQuest.setAuthFile("mulitImg029bf945-8eb6-4647-aeed-0e8038b4a82f_8903477341767617532.jpg");
        Response<ExternalRegResponse> response = externalRegFacade.register(regQuest);

        System.out.println("响应编码："+response.getCode());
        System.out.println("响应信息："+response.getMessage());
    }


}
