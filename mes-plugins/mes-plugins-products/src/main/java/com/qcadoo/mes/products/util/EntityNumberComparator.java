package com.qcadoo.mes.products.util;

import java.io.Serializable;
import java.util.Comparator;

import com.qcadoo.mes.api.Entity;

public class EntityNumberComparator implements Comparator<Entity>, Serializable {

    private static final long serialVersionUID = 6299937240797213900L;

    @Override
    public int compare(final Entity o1, final Entity o2) {
        return o1.getField("number").toString().compareTo(o2.getField("number").toString());
    }

}
