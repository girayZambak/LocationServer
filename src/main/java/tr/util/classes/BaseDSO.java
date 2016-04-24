package tr.util.classes;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public abstract class BaseDSO<T> {
    protected Class<T> droClass;
    private int pageSize;
    private int currentPage;
    private int rowCount;
    private String sortColumn;
    private String sortDirection;
    private boolean silinenleriGetir = false;

    public BaseDSO() {
        Type e = this.getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType)e;
        this.droClass = (Class)pt.getActualTypeArguments()[0];
        this.pageSize = 10;
        this.currentPage = 1;
    }

    public Map<String, Object> toParameterMap() {
        HashMap parameters = new HashMap();
        Field[] var2 = this.getClass().getDeclaredFields();
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Field f = var2[var4];

            try {
                parameters.put(f.getName(), f.get(this));
            } catch (Exception var7) {
                var7.printStackTrace();
            }
        }

        return parameters;
    }

    public abstract String toQuery();

    public Class<T> getDroClass() {
        return this.droClass;
    }

    public void setDroClass(Class<T> droClass) {
        this.droClass = droClass;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrentPage() {
        return this.currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getRowCount() {
        return this.rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public String getSortColumn() {
        return this.sortColumn;
    }

    public void setSortColumn(String sortColumn) {
        this.sortColumn = sortColumn;
    }

    public String getSortDirection() {
        return this.sortDirection;
    }

    public void setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
    }

    public boolean isSilinenleriGetir() {
        return this.silinenleriGetir;
    }

    public void setSilinenleriGetir(boolean silinenleriGetir) {
        this.silinenleriGetir = silinenleriGetir;
    }
}
