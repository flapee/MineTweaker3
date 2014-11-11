/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.openzen.zencode.symbolic.type.casting;

import stanhebben.zenscript.type.ZenType;
import org.openzen.zencode.util.MethodOutput;
import org.openzen.zencode.symbolic.TypeRegistry;

/**
 *
 * @author Stan
 */
public class CastingRuleF2I extends BaseCastingRule {
	private final TypeRegistry types;
	
	public CastingRuleF2I(ICastingRule baseRule, TypeRegistry types) {
		super(baseRule);
		
		this.types = types;
	}

	@Override
	public void compileInner(MethodOutput output) {
		output.f2i();
	}

	@Override
	public ZenType getInnerInputType() {
		return types.FLOAT;
	}

	@Override
	public ZenType getResultingType() {
		return types.INT;
	}
}