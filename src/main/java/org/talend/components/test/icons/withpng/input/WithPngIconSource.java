package org.talend.components.test.icons.withpng.input;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.talend.components.test.icons.withpng.config.WithPngIconMapperConfiguration;
import org.talend.sdk.component.api.configuration.Option;
import org.talend.sdk.component.api.input.Producer;
import org.talend.sdk.component.api.meta.Documentation;
import org.talend.sdk.component.api.record.Record;
import org.talend.sdk.component.api.service.record.RecordBuilderFactory;


import org.talend.components.test.icons.service.IconTesterService;

@Documentation("TODO fill the documentation for this source")
public class WithPngIconSource implements Serializable {
    private final WithPngIconMapperConfiguration configuration;
    private final IconTesterService service;
    private final RecordBuilderFactory builderFactory;

    public WithPngIconSource(@Option("configuration") final WithPngIconMapperConfiguration configuration,
                        final IconTesterService service,
                        final RecordBuilderFactory builderFactory) {
        this.configuration = configuration;
        this.service = service;
        this.builderFactory = builderFactory;
    }

    @PostConstruct
    public void init() {
        // this method will be executed once for the whole component execution,
        // this is where you can establish a connection for instance
    }

    @Producer
    public Record next() {
        // this is the method allowing you to go through the dataset associated
        // to the component configuration
        //
        // return null means the dataset has no more data to go through
        // you can use the builderFactory to create a new Record.
        return null;
    }

    @PreDestroy
    public void release() {
        // this is the symmetric method of the init() one,
        // release potential connections you created or data you cached
    }
}