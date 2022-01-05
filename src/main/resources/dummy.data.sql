2021-05-10 18:52:07.871  INFO 29132 --- [  restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2021-05-10 18:52:07.984  INFO 29132 --- [  restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2021-05-10 18:52:07.990  INFO 29132 --- [  restartedMain] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:37fe2d50-38ed-4933-9b6f-31cbbdec99f5'
2021-05-10 18:52:08.137 DEBUG 29132 --- [  restartedMain] o.s.b.w.s.ServletContextInitializerBeans : Mapping filters: filterRegistrationBean urls=[/*] order=-2147483647, characterEncodingFilter urls=[/*] order=-2147483648, formContentFilter urls=[/*] order=-9900, requestContextFilter urls=[/*] order=-105
2021-05-10 18:52:08.138 DEBUG 29132 --- [  restartedMain] o.s.b.w.s.ServletContextInitializerBeans : Mapping servlets: dispatcherServlet urls=[/], webServlet urls=[/h2-console/*]
2021-05-10 18:52:08.164 DEBUG 29132 --- [  restartedMain] o.s.b.a.m.w.servlet.WebMvcMetricsFilter  : Filter 'webMvcMetricsFilter' configured for use
2021-05-10 18:52:08.165 DEBUG 29132 --- [  restartedMain] o.s.b.w.s.f.OrderedRequestContextFilter  : Filter 'requestContextFilter' configured for use
2021-05-10 18:52:08.165 DEBUG 29132 --- [  restartedMain] s.b.w.s.f.OrderedCharacterEncodingFilter : Filter 'characterEncodingFilter' configured for use
2021-05-10 18:52:08.165 DEBUG 29132 --- [  restartedMain] o.s.b.w.s.f.OrderedFormContentFilter     : Filter 'formContentFilter' configured for use
2021-05-10 18:52:08.270  INFO 29132 --- [  restartedMain] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2021-05-10 18:52:08.327  INFO 29132 --- [  restartedMain] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.4.29.Final
2021-05-10 18:52:08.445  INFO 29132 --- [  restartedMain] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
2021-05-10 18:52:08.551  INFO 29132 --- [  restartedMain] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2021-05-10 18:52:09.067 DEBUG 29132 --- [  restartedMain] org.hibernate.SQL                        : 
    
    drop table if exists item CASCADE 
Hibernate: 
    
    drop table if exists item CASCADE 
2021-05-10 18:52:09.069 DEBUG 29132 --- [  restartedMain] org.hibernate.SQL                        : 
    
    drop table if exists phase CASCADE 
Hibernate: 
    
    drop table if exists phase CASCADE 
2021-05-10 18:52:09.070 DEBUG 29132 --- [  restartedMain] org.hibernate.SQL                        : 
    
    drop table if exists phase_approach CASCADE 
Hibernate: 
    
    drop table if exists phase_approach CASCADE 
2021-05-10 18:52:09.070 DEBUG 29132 --- [  restartedMain] org.hibernate.SQL                        : 
    
    drop table if exists phase_inputs CASCADE 
Hibernate: 
    
    drop table if exists phase_inputs CASCADE 
2021-05-10 18:52:09.070 DEBUG 29132 --- [  restartedMain] org.hibernate.SQL                        : 
    
    drop table if exists phase_objectives CASCADE 
Hibernate: 
    
    drop table if exists phase_objectives CASCADE 
2021-05-10 18:52:09.070 DEBUG 29132 --- [  restartedMain] org.hibernate.SQL                        : 
    
    drop table if exists phase_outputs CASCADE 
Hibernate: 
    
    drop table if exists phase_outputs CASCADE 
2021-05-10 18:52:09.071 DEBUG 29132 --- [  restartedMain] org.hibernate.SQL                        : 
    
    drop table if exists phase_steps CASCADE 
Hibernate: 
    
    drop table if exists phase_steps CASCADE 
2021-05-10 18:52:09.071 DEBUG 29132 --- [  restartedMain] org.hibernate.SQL                        : 
    
    drop table if exists well_defined_process CASCADE 
Hibernate: 
    
    drop table if exists well_defined_process CASCADE 
2021-05-10 18:52:09.073 DEBUG 29132 --- [  restartedMain] org.hibernate.SQL                        : 
    
    create table item (
       id bigint not null,
        active boolean,
        created_date timestamp,
        deactivated_date timestamp,
        name varchar(255),
        sequence_number integer,
        primary key (id)
    )
Hibernate: 
    
    create table item (
       id bigint not null,
        active boolean,
        created_date timestamp,
        deactivated_date timestamp,
        name varchar(255),
        sequence_number integer,
        primary key (id)
    )
2021-05-10 18:52:09.079 DEBUG 29132 --- [  restartedMain] org.hibernate.SQL                        : 
    
    create table phase (
       id bigint not null,
        active boolean,
        created_date timestamp,
        deactivated_date timestamp,
        name varchar(255),
        sequence_number integer,
        description varchar(255),
        process_id bigint not null,
        primary key (id)
    )
Hibernate: 
    
    create table phase (
       id bigint not null,
        active boolean,
        created_date timestamp,
        deactivated_date timestamp,
        name varchar(255),
        sequence_number integer,
        description varchar(255),
        process_id bigint not null,
        primary key (id)
    )
2021-05-10 18:52:09.080 DEBUG 29132 --- [  restartedMain] org.hibernate.SQL                        : 
    
    create table phase_approach (
       phase_id bigint not null,
        approach_id bigint not null
    )
Hibernate: 
    
    create table phase_approach (
       phase_id bigint not null,
        approach_id bigint not null
    )
2021-05-10 18:52:09.080 DEBUG 29132 --- [  restartedMain] org.hibernate.SQL                        : 
    
    create table phase_inputs (
       phase_id bigint not null,
        inputs_id bigint not null
    )
Hibernate: 
    
    create table phase_inputs (
       phase_id bigint not null,
        inputs_id bigint not null
    )
2021-05-10 18:52:09.081 DEBUG 29132 --- [  restartedMain] org.hibernate.SQL                        : 
    
    create table phase_objectives (
       phase_id bigint not null,
        objectives_id bigint not null
    )
Hibernate: 
    
    create table phase_objectives (
       phase_id bigint not null,
        objectives_id bigint not null
    )
2021-05-10 18:52:09.081 DEBUG 29132 --- [  restartedMain] org.hibernate.SQL                        : 
    
    create table phase_outputs (
       phase_id bigint not null,
        outputs_id bigint not null
    )
Hibernate: 
    
    create table phase_outputs (
       phase_id bigint not null,
        outputs_id bigint not null
    )
2021-05-10 18:52:09.082 DEBUG 29132 --- [  restartedMain] org.hibernate.SQL                        : 
    
    create table phase_steps (
       phase_id bigint not null,
        steps_id bigint not null
    )
Hibernate: 
    
    create table phase_steps (
       phase_id bigint not null,
        steps_id bigint not null
    )
2021-05-10 18:52:09.082 DEBUG 29132 --- [  restartedMain] org.hibernate.SQL                        : 
    
    create table well_defined_process (
       id bigint not null,
        active boolean,
        created_date timestamp,
        deactivated_date timestamp,
        name varchar(255),
        sequence_number integer,
        primary key (id)
    )
Hibernate: 
    
    create table well_defined_process (
       id bigint not null,
        active boolean,
        created_date timestamp,
        deactivated_date timestamp,
        name varchar(255),
        sequence_number integer,
        primary key (id)
    )
2021-05-10 18:52:09.083 DEBUG 29132 --- [  restartedMain] org.hibernate.SQL                        : 
    
    alter table phase_approach 
       add constraint UK_m8yg932ksiidg9xr9odu2hkgn unique (approach_id)
Hibernate: 
    
    alter table phase_approach 
       add constraint UK_m8yg932ksiidg9xr9odu2hkgn unique (approach_id)
2021-05-10 18:52:09.086 DEBUG 29132 --- [  restartedMain] org.hibernate.SQL                        : 
    
    alter table phase_inputs 
       add constraint UK_rh500wbtlh246btu3phj0p14o unique (inputs_id)
Hibernate: 
    
    alter table phase_inputs 
       add constraint UK_rh500wbtlh246btu3phj0p14o unique (inputs_id)
2021-05-10 18:52:09.087 DEBUG 29132 --- [  restartedMain] org.hibernate.SQL                        : 
    
    alter table phase_objectives 
       add constraint UK_aht7gdbdd6oavtyl0pa8fnpw7 unique (objectives_id)
Hibernate: 
    
    alter table phase_objectives 
       add constraint UK_aht7gdbdd6oavtyl0pa8fnpw7 unique (objectives_id)
2021-05-10 18:52:09.088 DEBUG 29132 --- [  restartedMain] org.hibernate.SQL                        : 
    
    alter table phase_outputs 
       add constraint UK_cis9k50hw2jyvv50lb3vmjb4a unique (outputs_id)
Hibernate: 
    
    alter table phase_outputs 
       add constraint UK_cis9k50hw2jyvv50lb3vmjb4a unique (outputs_id)
2021-05-10 18:52:09.089 DEBUG 29132 --- [  restartedMain] org.hibernate.SQL                        : 
    
    alter table phase_steps 
       add constraint UK_jyycr73rqj9eyuur5lqjrsnir unique (steps_id)
Hibernate: 
    
    alter table phase_steps 
       add constraint UK_jyycr73rqj9eyuur5lqjrsnir unique (steps_id)
2021-05-10 18:52:09.089 DEBUG 29132 --- [  restartedMain] org.hibernate.SQL                        : 
    
    alter table phase 
       add constraint FKj90w859ermhw0wqugdjqpsx5w 
       foreign key (process_id) 
       references well_defined_process
Hibernate: 
    
    alter table phase 
       add constraint FKj90w859ermhw0wqugdjqpsx5w 
       foreign key (process_id) 
       references well_defined_process
2021-05-10 18:52:09.096 DEBUG 29132 --- [  restartedMain] org.hibernate.SQL                        : 
    
    alter table phase_approach 
       add constraint FKjssqk2xnnypr2lnuvw7qy5tx5 
       foreign key (approach_id) 
       references item
Hibernate: 
    
    alter table phase_approach 
       add constraint FKjssqk2xnnypr2lnuvw7qy5tx5 
       foreign key (approach_id) 
       references item
2021-05-10 18:52:09.098 DEBUG 29132 --- [  restartedMain] org.hibernate.SQL                        : 
    
    alter table phase_approach 
       add constraint FK61kr7s56a5t0xx09r1hu2rumg 
       foreign key (phase_id) 
       references phase
Hibernate: 
    
    alter table phase_approach 
       add constraint FK61kr7s56a5t0xx09r1hu2rumg 
       foreign key (phase_id) 
       references phase
2021-05-10 18:52:09.099 DEBUG 29132 --- [  restartedMain] org.hibernate.SQL                        : 
    
    alter table phase_inputs 
       add constraint FKabakysd50cyky5pbmw4i9iyfm 
       foreign key (inputs_id) 
       references item
Hibernate: 
    
    alter table phase_inputs 
       add constraint FKabakysd50cyky5pbmw4i9iyfm 
       foreign key (inputs_id) 
       references item
2021-05-10 18:52:09.100 DEBUG 29132 --- [  restartedMain] org.hibernate.SQL                        : 
    
    alter table phase_inputs 
       add constraint FKqufkp5y96mwoqm9e1mnbho2ul 
       foreign key (phase_id) 
       references phase
Hibernate: 
    
    alter table phase_inputs 
       add constraint FKqufkp5y96mwoqm9e1mnbho2ul 
       foreign key (phase_id) 
       references phase
2021-05-10 18:52:09.102 DEBUG 29132 --- [  restartedMain] org.hibernate.SQL                        : 
    
    alter table phase_objectives 
       add constraint FKimvyw7f5qengxym5om2nvfpfk 
       foreign key (objectives_id) 
       references item
Hibernate: 
    
    alter table phase_objectives 
       add constraint FKimvyw7f5qengxym5om2nvfpfk 
       foreign key (objectives_id) 
       references item
2021-05-10 18:52:09.103 DEBUG 29132 --- [  restartedMain] org.hibernate.SQL                        : 
    
    alter table phase_objectives 
       add constraint FKiqgjby1whm5eixjyqrm9wsdw9 
       foreign key (phase_id) 
       references phase
Hibernate: 
    
    alter table phase_objectives 
       add constraint FKiqgjby1whm5eixjyqrm9wsdw9 
       foreign key (phase_id) 
       references phase
2021-05-10 18:52:09.105 DEBUG 29132 --- [  restartedMain] org.hibernate.SQL                        : 
    
    alter table phase_outputs 
       add constraint FKm1cttoi0qm0u234qwr5iax24x 
       foreign key (outputs_id) 
       references item
Hibernate: 
    
    alter table phase_outputs 
       add constraint FKm1cttoi0qm0u234qwr5iax24x 
       foreign key (outputs_id) 
       references item
2021-05-10 18:52:09.106 DEBUG 29132 --- [  restartedMain] org.hibernate.SQL                        : 
    
    alter table phase_outputs 
       add constraint FKn4t3wdfxavlucgy3yq2esfwwo 
       foreign key (phase_id) 
       references phase
Hibernate: 
    
    alter table phase_outputs 
       add constraint FKn4t3wdfxavlucgy3yq2esfwwo 
       foreign key (phase_id) 
       references phase
2021-05-10 18:52:09.108 DEBUG 29132 --- [  restartedMain] org.hibernate.SQL                        : 
    
    alter table phase_steps 
       add constraint FKnnhcjvyd96j3nmt2r2d54pakc 
       foreign key (steps_id) 
       references item
Hibernate: 
    
    alter table phase_steps 
       add constraint FKnnhcjvyd96j3nmt2r2d54pakc 
       foreign key (steps_id) 
       references item
2021-05-10 18:52:09.109 DEBUG 29132 --- [  restartedMain] org.hibernate.SQL                        : 
    
    alter table phase_steps 
       add constraint FK1mmwkbqw2ymx5ou97pdxig0t0 
       foreign key (phase_id) 
       references phase
Hibernate: 
    
    alter table phase_steps 
       add constraint FK1mmwkbqw2ymx5ou97pdxig0t0 
       foreign key (phase_id) 
       references phase
2021-05-10 18:52:09.114  INFO 29132 --- [  restartedMain] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2021-05-10 18:52:09.122  INFO 29132 --- [  restartedMain] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'