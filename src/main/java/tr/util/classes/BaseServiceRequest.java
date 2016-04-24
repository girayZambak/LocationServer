package tr.util.classes;

import java.lang.reflect.ParameterizedType;

public class BaseServiceRequest {
    private String kullaniciAdi = null;
    private String oturumKodu = null;
    private Long makamId = null;

    protected BaseServiceRequest() {
    }

    public String getKullaniciAdi() {
        return this.kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getOturumKodu() {
        return this.oturumKodu;
    }

    public void setOturumKodu(String oturumKodu) {
        this.oturumKodu = oturumKodu;
    }

    public Long getMakamId() {
        return this.makamId;
    }

    public void setMakamId(Long makamId) {
        this.makamId = makamId;
    }

    public static class BaseServiceRequestBuilder<T extends BaseServiceRequest> {
        protected T serviceRequest;

        protected BaseServiceRequestBuilder() {
            try {
                this.serviceRequest = ((Class<T>)((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[0]).newInstance();
            } catch (InstantiationException var2) {
                ;
            } catch (IllegalAccessException var3) {
                var3.printStackTrace();
            }

        }

        public T setKullaniciAdi(String kullaniciAdi) {
            ((BaseServiceRequest)this.serviceRequest).kullaniciAdi = kullaniciAdi;
            return this.serviceRequest;
        }

        public T setOturumKodu(String oturumKodu) {
            ((BaseServiceRequest)this.serviceRequest).oturumKodu = oturumKodu;
            return this.serviceRequest;
        }

        public T setMakamId(Long makamId) {
            ((BaseServiceRequest)this.serviceRequest).makamId = makamId;
            return this.serviceRequest;
        }

        public T getRequest() {
            return this.serviceRequest;
        }
    }
}
