package com.qcadoo.mes.products.print;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;

import com.lowagie.text.DocumentException;
import com.qcadoo.mes.api.Entity;
import com.qcadoo.mes.api.TranslationService;

public abstract class DocumentService {

    private DecimalFormat decimalFormat;

    @Autowired
    private TranslationService translationService;

    public abstract void generateDocument(final Entity entity, final Locale locale) throws IOException, DocumentException;

    protected abstract String getSuffix();

    protected final TranslationService getTranslationService() {
        return translationService;
    }

    protected abstract String getReportTitle(final Locale locale);

    public final DecimalFormat getDecimalFormat() {
        return decimalFormat;
    }

    protected void setDecimalFormat(final DecimalFormat decimalFormat) {
        this.decimalFormat = decimalFormat;
    }

}
