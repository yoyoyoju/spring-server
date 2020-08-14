package mock;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
class ValueModelAssembler implements RepresentationModelAssembler<Value, EntityModel<Value>> {
    @Override
    public EntityModel<Value> toModel(Value value) {
        return EntityModel.of(value,
                linkTo(methodOn(ValueController.class).one(value.getId())).withSelfRel(),
                linkTo(methodOn(ValueController.class).all()).withRel("values"));
    }
}


