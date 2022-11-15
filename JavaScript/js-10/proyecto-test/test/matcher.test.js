test('asignación de un objeto', () => {
    const datos = {uno: 1};
    datos['dos'] = 2;
    expect(datos).toEqual({uno: 1, dos: 2});
  });