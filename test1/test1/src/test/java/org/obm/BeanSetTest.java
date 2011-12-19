package org.obm;

import org.junit.Assert;
import org.junit.Test;

public class BeanSetTest {

	@Test
	public void testUnicity() {
		MyBean jaures = new MyBean("Jean Jaures", "jean.jaures@sfio.fr", 54, "male");
		MyBean jaures2 = new MyBean("Jean Jaures", "jean.jaures@sfio.fr", 54, "male");
		MyBean blum = new MyBean("Léon Blum", "leon.blum@sfio.fr", 77, "male");
		BeanSet beanSet = new BeanSet();
		beanSet.add(jaures);
		beanSet.add(jaures2);
		beanSet.add(blum);
		Assert.assertEquals(2, beanSet.count());
	}

	@Test
	public void testInsertionOrderIsKept() {
		MyBean jaures = new MyBean("Jean Jaures", "jean.jaures@sfio.fr", 54, "male");
		MyBean blum = new MyBean("Léon Blum", "leon.blum@sfio.fr", 77, "male");
		MyBean rocard = new MyBean("Michel Rocard", "michel.rocard@ps.fr", "male");
		BeanSet beanSet = new BeanSet();
		beanSet.add(rocard);
		beanSet.add(blum);
		beanSet.add(jaures);
		Assert.assertArrayEquals(beanSet.toArray(), new MyBean[] {rocard, blum, jaures});
	}
}
