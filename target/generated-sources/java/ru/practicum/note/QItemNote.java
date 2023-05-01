package ru.practicum.note;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QItemNote is a Querydsl query type for ItemNote
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QItemNote extends EntityPathBase<ItemNote> {

    private static final long serialVersionUID = -942011094L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QItemNote itemNote = new QItemNote("itemNote");

    public final DateTimePath<java.time.Instant> dateOfNote = createDateTime("dateOfNote", java.time.Instant.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ru.practicum.item.model.QItem item;

    public final StringPath text = createString("text");

    public QItemNote(String variable) {
        this(ItemNote.class, forVariable(variable), INITS);
    }

    public QItemNote(Path<? extends ItemNote> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QItemNote(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QItemNote(PathMetadata metadata, PathInits inits) {
        this(ItemNote.class, metadata, inits);
    }

    public QItemNote(Class<? extends ItemNote> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.item = inits.isInitialized("item") ? new ru.practicum.item.model.QItem(forProperty("item"), inits.get("item")) : null;
    }

}

