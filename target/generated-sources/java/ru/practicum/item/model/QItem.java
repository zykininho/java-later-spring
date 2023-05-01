package ru.practicum.item.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QItem is a Querydsl query type for Item
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QItem extends EntityPathBase<Item> {

    private static final long serialVersionUID = -1158943940L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QItem item = new QItem("item");

    public final DateTimePath<java.time.Instant> dateResolved = createDateTime("dateResolved", java.time.Instant.class);

    public final BooleanPath hasImage = createBoolean("hasImage");

    public final BooleanPath hasVideo = createBoolean("hasVideo");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath mimeType = createString("mimeType");

    public final StringPath resolvedUrl = createString("resolvedUrl");

    public final SetPath<String, StringPath> tags = this.<String, StringPath>createSet("tags", String.class, StringPath.class, PathInits.DIRECT2);

    public final StringPath title = createString("title");

    public final BooleanPath unread = createBoolean("unread");

    public final StringPath url = createString("url");

    public final ru.practicum.user.QUser user;

    public QItem(String variable) {
        this(Item.class, forVariable(variable), INITS);
    }

    public QItem(Path<? extends Item> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QItem(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QItem(PathMetadata metadata, PathInits inits) {
        this(Item.class, metadata, inits);
    }

    public QItem(Class<? extends Item> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new ru.practicum.user.QUser(forProperty("user")) : null;
    }

}

