CREATE TABLE my_entity
(
    id         UUID NOT NULL,
    created_at TIMESTAMP WITHOUT TIME ZONE,
    updated_at TIMESTAMP WITHOUT TIME ZONE,
    CONSTRAINT pk_myentity PRIMARY KEY (id)
);

ALTER TABLE my_entity
    ADD CONSTRAINT uc_myentity_id UNIQUE (id);